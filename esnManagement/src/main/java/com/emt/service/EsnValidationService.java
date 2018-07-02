package com.emt.service;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.emt.common.ESNConstants;
import com.emt.exception.ApiValidationFailureException;
import com.emt.model.BatchState;
import com.emt.model.BridgeSKU;
import com.emt.model.EsnInfo;
import com.emt.model.ExcelDump;
import com.emt.model.User;
import com.emt.model.ValidationJob;
import com.emt.repository.BatchStateRepository;
import com.emt.repository.BridgeSKURepository;
import com.emt.repository.EsnInfoRepository;
import com.emt.repository.ExcelRepository;
import com.emt.repository.UserRepository;
import com.emt.repository.ValidationJobRepository;
import com.emt.utilities.EsnValidationUtility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EsnValidationService {

	@Autowired
	EsnInfoRepository esnRepository;

	@Autowired
	ExcelRepository excelRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	ValidationJobRepository validationJobRepository;

	@Autowired
	BatchStateRepository batchStateRepository;

	@Autowired
	EsnInfoRepository esnInfoRepository;

	@Autowired
	BridgeSKURepository bridgeSKURepository;

	@Value("${interval}")
	private int interval;

	/**
	 * This method fetches all the entries of tblExcelDump and passes it to
	 * preTypeValidation method. Once entries are populated in tblEsnInfo,
	 * esn18/esn14 and SKU values of each entry is passed to the WebServiceUtility
	 * for checking consumption status of ESN.
	 */
	public List<ValidationJob> validateEsn() {
		cleanUpConsumedEsnRecords();

		reallocateUnConsumedEsnRecords();

		List<ExcelDump> excelObj = excelRepository.findAll();
		preTypeValidation(excelObj);

		EsnValidationUtility webServiceUtility = new EsnValidationUtility();
		List<EsnInfo> esnInfoList = esnRepository.findAllByIsConsumed(false);

		int totalEsnValidated = 0;
		int validEsnCount = 0;
		if (CollectionUtils.isNotEmpty(esnInfoList)) {
			log.info("Running Esn Validation batch job on" + ESNConstants.DATE_TIME);
			validationJobEntry(totalEsnValidated, validEsnCount, ESNConstants.RUNNING);
			for (EsnInfo esn : esnInfoList) {
				if (totalEsnValidated % interval == 0 && totalEsnValidated != 0) {
					validationJobEntry(totalEsnValidated, validEsnCount, ESNConstants.RUNNING);
				}
				try {
					boolean isConsumed = true;

					if (!Long.toString(esn.getEsn18()).isEmpty()) {
						isConsumed = webServiceUtility.esnValidation(Long.toString(esn.getEsn18()), esn.getSku());
						esn.setConsumed(isConsumed);
					} else if (!Long.toString(esn.getEsnHEX14()).isEmpty()) {
						isConsumed = webServiceUtility.esnValidation(Long.toString(esn.getEsnHEX14()), esn.getSku());
						esn.setConsumed(isConsumed);
					}
					++totalEsnValidated;
					if (!isConsumed) {
						++validEsnCount;
					}
					log.info("Updating EsnInfo table for setting isConsumed");
					esnRepository.save(esn);
				} catch (Exception e) {
					log.error("Error occured while validating ESN in service", e);
				}
			}
			if (esnInfoList.size() == totalEsnValidated) {
				validationJobEntry(totalEsnValidated, validEsnCount, "Successful");
			}

			return validationJobRepository.findAll();
		}
		return Collections.emptyList();
	}

	private void validationJobEntry(int totalEsnValidated, int validEsnCount, String status) {
		ValidationJob validationJobObj = null;
		try {
			if (totalEsnValidated == 0) {
				validationJobObj = new ValidationJob();
			} else {
				BatchState batchStateTableObj = null;
				batchStateTableObj = batchStateRepository.findByState(ESNConstants.RUNNING);
				if (batchStateTableObj == null) {
					throw new ApiValidationFailureException(ESNConstants.BATCH_STATE_FAILURE_MESSAGE);
				}

				Optional<ValidationJob> validationJobOptional = validationJobRepository
						.findOptionalByState(batchStateTableObj);
				if (validationJobOptional.isPresent())
					validationJobObj = validationJobOptional.get();
			}

			if (validationJobObj != null) {
				populateValidationJobObj(validationJobObj, totalEsnValidated, validEsnCount, status);
			}
		} catch (Exception e) {
			log.error("Error occured while validationJobEntry entry", e);
			BatchState batchStateTableObj = null;

			batchStateTableObj = batchStateRepository.findByState(ESNConstants.RUNNING);
			if (batchStateTableObj == null) {
				throw new ApiValidationFailureException(ESNConstants.BATCH_STATE_FAILURE_MESSAGE);
			}

			List<ValidationJob> validationJobList = validationJobRepository.findByState(batchStateTableObj);
			validationJobList.stream()
					.forEach(entry -> populateValidationJobObj(entry, totalEsnValidated, validEsnCount, "Failed"));
		}
	}

	private void populateValidationJobObj(ValidationJob validationJobObj, int totalEsnValidated, int validEsnCount,
			String status) {
		BatchState batchStateTableObj = null;

		batchStateTableObj = batchStateRepository.findByState(status);
		if (batchStateTableObj == null) {
			throw new ApiValidationFailureException(ESNConstants.BATCH_STATE_FAILURE_MESSAGE);
		}

		if (batchStateTableObj != null)
			validationJobObj.setState(batchStateTableObj);

		Optional<User> userTableOptional = userRepository.findById((long) 1);// As only 1 entry exists in tblUser for
																				// "admin" as of now. Later replaced by
																				// logged in User's ID received from UI.
		if (userTableOptional.isPresent())
			validationJobObj.setUserForActivity(userTableOptional.get());

		validationJobObj.setDateForActivity(new Date());
		validationJobObj.setTotalEsnValidated(totalEsnValidated);
		validationJobObj.setValidEsnCount(validEsnCount);
		validationJobRepository.save(validationJobObj);
	}

	/**
	 * This method deletes all invalid (consumed) records 30 days+ before moving
	 * data from dump to esnInfo.
	 */
	private void cleanUpConsumedEsnRecords() {
		esnRepository.findAllByIsConsumed(true).removeIf(item -> (Days
				.daysBetween(new DateTime(item.getDateImported()), new DateTime()).isGreaterThan(Days.days(30))));
	}

	/**
	 * This method re-allocates individual records 48 hours+ if user has not
	 * consumed it.
	 */
	private void reallocateUnConsumedEsnRecords() {
		esnRepository
				.findAllByIsConsumed(false).stream().filter(item -> (Days
						.daysBetween(new DateTime(item.getDateClaimed()), new DateTime()).isGreaterThan(Days.days(2))))
				.forEach(item -> {
					item.setUserClaimed(null);
					item.setDateClaimed(null);
				});
	}

	/**
	 * This method performs type validation and conversion of specific String
	 * fields, prior to populating tblESNInfo data from tblExcelDump data.
	 * 
	 * @param excelObj
	 */
	private void preTypeValidation(List<ExcelDump> excelObj) {
		String regex = "\\d+";
		Pattern pattern = Pattern.compile(regex);

		excelObj.forEach(obj -> {
			EsnInfo esn = new EsnInfo();
			if (pattern.matcher(obj.getStoreId()).matches() && pattern.matcher(obj.getEsn18()).matches()
			/* && pattern.matcher(obj.getEsnHEX14()).matches() */) {
				esn.setStoreId(Integer.parseInt(obj.getStoreId()));
				Optional<BridgeSKU> bridgeSKUOptional = bridgeSKURepository.findBySku(obj.getSku());
				if (bridgeSKUOptional.isPresent()) {
					esn.setSku(bridgeSKUOptional.get());
				}

				esn.setEsn18(Long.parseLong(obj.getEsn18()));
				/*
				 * esn.setEsnHEX14(Long.parseLong(obj.getEsnHEX14()));
				 * esn.setImei15(Long.parseLong(obj.getImei15()));
				 */
				esn.setImported(true);
				esn.setDateImported(obj.getDateCreated());
				esn.setUserClaimed(null);
				esn.setDateClaimed(null);
				esn.setUserRequestValidation(null);
				esn.setDateRequestedValidation(null);

				Optional<EsnInfo> entry = esnRepository.findByIsImportedAndEsn18(true,
						Long.parseLong(obj.getEsn18()));
				if (!entry.isPresent()) {
					esnRepository.save(esn);
				}
			}
		});
	}

	public List<ValidationJob> refreshValidationStatus() {
		log.info("Fetching the updated tblValidationJob data");
		return validationJobRepository.findAll();
	}

	/**
	 * This method sets userClaimed & dateClaimed fields for the Logged-In user/Admin-In user.
	 * 
	 * @param id
	 * @return boolean
	 */
	public List<EsnInfo> claimEsn(User user, String device, String esnCount) {
		if (user != null && StringUtils.isNotEmpty(device) && StringUtils.isNotEmpty(esnCount)) {
			Optional<User> userObj = userRepository.findById(user.getUserId());
			Optional<BridgeSKU> bridgeSkuObj = bridgeSKURepository.findByDevice(device);
			
			if (userObj.get().getIsAdmin() != null && (!userObj.get().getIsAdmin())) {
				// User
				assignESNsToUser(userObj, bridgeSkuObj,esnCount);
				return esnInfoRepository.findByUserClaimed(userObj.get());
			} else {
				// Admin
				assignESNsToUser(userObj, bridgeSkuObj,esnCount);
				return esnInfoRepository.findAll();
			}
		}
		return Collections.emptyList();
	}

	private void assignESNsToUser(Optional<User> userObj, Optional<BridgeSKU> bridgeSkuObj, String requestedEsnCount) {
		if (bridgeSkuObj.isPresent()) {
			Pageable count = new PageRequest(0, Integer.parseInt(requestedEsnCount), Direction.ASC, "sku");
			int availableEsnCount = esnInfoRepository.countBySkuAndUserClaimedIsNull(bridgeSkuObj.get());
			if(Integer.parseInt(requestedEsnCount) <= availableEsnCount){
				List<EsnInfo> claimableEsnInfoList = esnInfoRepository.findBySkuAndUserClaimedIsNull(bridgeSkuObj.get(), count);
				if (CollectionUtils.isNotEmpty(claimableEsnInfoList)) {
					claimableEsnInfoList.stream().forEach(item -> {
						if (userObj.isPresent()) {
							item.setUserClaimed(userObj.get());
						}
						item.setDateClaimed(new Date());
						esnRepository.save(item);
					});
				}
			}
			else {
				throw new ApiValidationFailureException(
						"Not enough ESNs available for this Device. Requested Esn Count : " + requestedEsnCount + "."
								+ " Available Esn Count : "+availableEsnCount);
			}
			
		}
	}

	public List<EsnInfo> getDashboardData(User user) {
		if (user != null) {
			Optional<User> userObj = userRepository.findById(user.getUserId());
			if (userObj.get().getIsAdmin() != null && (!userObj.get().getIsAdmin())) {
				Optional<User> userTableOptional = userRepository.findById(userObj.get().getUserId());
				if (userTableOptional.isPresent()) {
				return esnInfoRepository.findByUserClaimed(userTableOptional.get());
				}
			} else {
				return esnInfoRepository.findAll();
			}
		}
		return Collections.emptyList();
	}

}

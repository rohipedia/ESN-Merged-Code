package com.emt.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	
	private boolean stopValidationFlag = false;

	/**
	 * This method fetches all the entries of tblExcelDump and passes it to
	 * validEsnInfoEntry method. Once entries are populated in tblEsnInfo,
	 * esn18/esn14 and SKU values of each entry is passed to the WebServiceUtility
	 * for checking consumption status of ESN.
	 * @param user 
	 */
	public List<ValidationJob> validateEsn(User user) {
		cleanUpConsumedEsnRecords();

		reallocateUnConsumedEsnRecords();

		List<ExcelDump> excelDumpList = excelRepository.findAll();
		validEsnInfoEntry(excelDumpList);

		EsnValidationUtility webServiceUtility = new EsnValidationUtility();
		List<EsnInfo> esnInfoList = esnRepository.findAllByIsConsumed(false);

		int totalEsnValidated = 0;
		int validEsnCount = 0;
		if (CollectionUtils.isNotEmpty(esnInfoList)) {
			log.info("Running Esn Validation batch job on" + ESNConstants.DATE_TIME);
			validationJobEntry(user, totalEsnValidated, validEsnCount, ESNConstants.RUNNING);
			for (EsnInfo esn : esnInfoList) {

				if (!stopValidationFlag) {
					if (totalEsnValidated % interval == 0 && totalEsnValidated != 0) {
						validationJobEntry(user, totalEsnValidated, validEsnCount, ESNConstants.RUNNING);
					}
					try {
						boolean isConsumed;

						if (!Long.toString(esn.getEsn18()).isEmpty()) {
							isConsumed = webServiceUtility.esnValidation(Long.toString(esn.getEsn18()), esn.getSku());
							esn.setConsumed(isConsumed);
						} else if (!Long.toString(esn.getEsnHex14()).isEmpty()) {
							isConsumed = webServiceUtility.esnValidation(Long.toString(esn.getEsnHex14()), esn.getSku());
							esn.setConsumed(isConsumed);
						} else {
							isConsumed = webServiceUtility.esnValidation(Long.toString(esn.getImei15()), esn.getSku());
							esn.setConsumed(isConsumed);
						}
						++totalEsnValidated;
						if (!isConsumed) {
							++validEsnCount;
						}
						log.info("Updating EsnInfo table for setting isConsumed of esn" +esn);
						esnRepository.save(esn);
					} catch (Exception e) {
						log.error("Error occured while validating ESN " + esn + " in service", e);
					}
				}
			}
			
			stopValidationFlag = false;
			if (esnInfoList.size() == totalEsnValidated && !stopValidationFlag) {
				validationJobEntry(user, totalEsnValidated, validEsnCount, "Successful");
			} else if(stopValidationFlag) {
				validationJobEntry(user, totalEsnValidated, validEsnCount, "Stopped");
			} else {
				validationJobEntry(user, totalEsnValidated, validEsnCount, "Failed");
			}

			return validationJobRepository.findAll();
		}
		return Collections.emptyList();
	}

	private void validationJobEntry(User user, int totalEsnValidated, int validEsnCount, String status) {
		ValidationJob validationJobObj = null;
		try {
			if (totalEsnValidated == 0 && !stopValidationFlag && status.equalsIgnoreCase("Running")) {
				validationJobObj = new ValidationJob();
			} else {
				BatchState batchStateObj = batchStateRepository.findByState(ESNConstants.RUNNING);
				if (batchStateObj == null) {
					throw new ApiValidationFailureException(ESNConstants.BATCH_STATE_FAILURE_MESSAGE);
				}

				Optional<ValidationJob> validationJobOptional = validationJobRepository
						.findOptionalByState(batchStateObj);
				if (validationJobOptional.isPresent())
					validationJobObj = validationJobOptional.get();
			}

			if (validationJobObj != null) {
				insertValidationJobRecord(user, validationJobObj, totalEsnValidated, validEsnCount, status);
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
					.forEach(entry -> insertValidationJobRecord(user, entry, totalEsnValidated, validEsnCount, "Failed"));
		}
	}

	private void insertValidationJobRecord(User user, ValidationJob validationJobObj, int totalEsnValidated, int validEsnCount,
			String status) {
		BatchState batchStateTableObj = batchStateRepository.findByState(status);
		if (batchStateTableObj == null) {
			throw new ApiValidationFailureException(ESNConstants.BATCH_STATE_FAILURE_MESSAGE);
		}
		validationJobObj.setState(batchStateTableObj);

		Optional<User> userTableOptional = userRepository.findById(user.getUserId());
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
	 * It only fills valid records in the excelInfo table.
	 * @param excelObj
	 * 
	 */
	private void validEsnInfoEntry(List<ExcelDump> excelDumpList) {
		excelDumpList.forEach(excelObj -> {
			EsnInfo esnInfoObj = new EsnInfo();
			Optional<BridgeSKU> bridgeSKUOptional = bridgeSKURepository.findBySku(excelObj.getSku());
			if (bridgeSKUOptional.isPresent()) {
				esnInfoObj.setSku(bridgeSKUOptional.get());
			} else {
				throw new ApiValidationFailureException("SKU "+excelObj.getSku()+" not found in tblBridgeSKU. Verify Imported SKUs before triggering ESN Validation");
			}
			esnInfoObj.setStoreId(Integer.parseInt(excelObj.getStoreId()));
			esnInfoObj.setEsn18(typeValidationAndConversion(excelObj.getEsn18()));
			esnInfoObj.setEsnHex14(typeValidationAndConversion(excelObj.getEsnHex14()));
			esnInfoObj.setImei15(typeValidationAndConversion(excelObj.getImei15()));
			esnInfoObj.setImported(true);
			esnInfoObj.setDateImported(excelObj.getDateCreated());
			esnInfoObj.setUserClaimed(null);
			esnInfoObj.setDateClaimed(null);
			esnInfoObj.setUserRequestValidation(null);
			esnInfoObj.setDateRequestedValidation(null);

			Optional<EsnInfo> esn18Entry = esnRepository.findByIsImportedAndEsn18AndEsn18IsNotNull(true,esnInfoObj.getEsn18());
			Optional<EsnInfo> esnHex14Entry = esnRepository.findByIsImportedAndEsnHex14AndEsnHex14IsNotNull(true,esnInfoObj.getEsnHex14());
			Optional<EsnInfo> imei15Entry = esnRepository.findByIsImportedAndImei15AndImei15IsNotNull(true,esnInfoObj.getImei15());
			if (!esn18Entry.isPresent() && !esnHex14Entry.isPresent() && !imei15Entry.isPresent()) {
				esnRepository.save(esnInfoObj);
			}
		});
	}

	private Long typeValidationAndConversion(String field) {
		String regex = "\\d+";
		Pattern pattern = Pattern.compile(regex);
		
		if (StringUtils.isNotBlank(field) && pattern.matcher(field).matches()) {
			return Long.parseLong(field);
		}
		return null;
	}

	public List<ValidationJob> refreshEsnValidationStatus() {
		log.info("Fetching the updated tblValidationJob data");
		return validationJobRepository.findAll();
	}

	/**
	 * This method sets userClaimed & dateClaimed fields for the Logged-In user/Admin-In user.
	 * 
	 * @param id
	 * @return boolean
	 */
	public List<EsnInfo> claimEsn(User user, String sku, String esnCount) {
		if (user != null && StringUtils.isNotEmpty(sku) && StringUtils.isNotEmpty(esnCount)) {
			Optional<User> userObj = userRepository.findById(user.getUserId());
			Optional<BridgeSKU> bridgeSkuObj = bridgeSKURepository.findBySku(sku);
			if(userObj.isPresent() && bridgeSkuObj.isPresent()) {
				if (userObj.get().getIsAdmin() != null && (!userObj.get().getIsAdmin())) {
					// User
					assignESNsToUser(userObj.get(), bridgeSkuObj.get(),esnCount);
					return esnInfoRepository.findByUserClaimed(userObj.get());
				} else if (userObj.get().getIsAdmin() != null && (userObj.get().getIsAdmin())) {
					// Admin
					assignESNsToUser(userObj.get(), bridgeSkuObj.get(),esnCount);
					return esnInfoRepository.findAllByOrderByUserClaimedAsc();
				}
			}
		}
		return null;
	}

	private void assignESNsToUser(User user, BridgeSKU bridgeSKU, String requestedEsnCount) {
		Pageable count = new PageRequest(0, Integer.parseInt(requestedEsnCount), Direction.ASC, "sku");
		int availableEsnCount = esnInfoRepository.countBySkuAndUserClaimedIsNull(bridgeSKU);
		if (Integer.parseInt(requestedEsnCount) <= availableEsnCount) {
			List<EsnInfo> claimableEsnInfoList = esnInfoRepository.findBySkuAndUserClaimedIsNull(bridgeSKU, count);
			if (CollectionUtils.isNotEmpty(claimableEsnInfoList)) {
				claimableEsnInfoList.stream().forEach(item -> {
					item.setUserClaimed(user);
					item.setDateClaimed(new Date());
					esnRepository.save(item);
				});
			}
		} else {
			throw new ApiValidationFailureException("Not enough ESNs available for this Device. Requested Esn Count : "
					+ requestedEsnCount + "." + " Available Esn Count : " + availableEsnCount);
		}
	}

	public Map<String, Object> getDashboardData(User user) {

		if (user != null) {
			Map<String, Object> dashboardDataResultSet = new HashMap<>();

			Optional<User> userObj = userRepository.findById(user.getUserId());
			if(userObj.isPresent()) {
				if (userObj.get().getIsAdmin() != null && (!userObj.get().getIsAdmin())) {
					// User
					List<EsnInfo> gridData = esnInfoRepository.findByUserClaimed(userObj.get());
					dashboardDataResultSet.put("userName", userObj.get().getUserName());
					dashboardDataResultSet.put("lastLogin", userObj.get().getLastLogin());
					dashboardDataResultSet.put("totalClaimedESNs", gridData.size());
					long validESNsOutOfClaimed = gridData.stream().filter(item -> !item.isConsumed()).count();
					dashboardDataResultSet.put("validESNsOutOfClaimed", validESNsOutOfClaimed);
					List<BridgeSKU> bridgeSkuList = bridgeSKURepository.findAll();
					dashboardDataResultSet.put("deviceData", bridgeSkuList);
					dashboardDataResultSet.put("data", gridData);
					return dashboardDataResultSet;
				} else if (userObj.get().getIsAdmin() != null && (userObj.get().getIsAdmin())) {
					// Admin
					Date esnLastImportedDate = null;
					Date esnLastValidatedDate = null;
					long esnLastPulled = 0;
					List<EsnInfo> gridData = esnInfoRepository.findAllByOrderByUserClaimedAsc();

					dashboardDataResultSet.put("userName", userObj.get().getUserName());
					dashboardDataResultSet.put("lastLogin", userObj.get().getLastLogin());

					List<EsnInfo> loggedInUserData = esnInfoRepository.findByUserClaimed(userObj.get());
					dashboardDataResultSet.put("totalClaimedESNs", loggedInUserData.size());

					long validESNsOutOfClaimed = loggedInUserData.stream().filter(item -> !item.isConsumed()).count();
					dashboardDataResultSet.put("validESNsOutOfClaimed", validESNsOutOfClaimed);

					Optional<EsnInfo> esnLastImportedObj = esnInfoRepository.findTopByOrderByDateImportedDesc();
					if (esnLastImportedObj.isPresent()) {
						esnLastImportedDate = esnLastImportedObj.get().getDateImported();
						esnLastPulled = gridData.stream().filter(
								item -> item.getDateImported().equals(esnLastImportedObj.get().getDateImported()))
								.count();
					}
					dashboardDataResultSet.put("esnLastImportedDate", esnLastImportedDate);
					dashboardDataResultSet.put("totalESNLastPulled", esnLastPulled);

					Optional<ValidationJob> esnLastValidatedObj = validationJobRepository
							.findTopByOrderByDateForActivityDesc();
					if (esnLastValidatedObj.isPresent()) {
						esnLastValidatedDate = esnLastValidatedObj.get().getDateForActivity();
					}
					dashboardDataResultSet.put("esnLastValidatedDate", esnLastValidatedDate);

					long totalAvailableValidESNs = gridData.stream().filter(item -> !item.isConsumed()).count();
					dashboardDataResultSet.put("totalAvailableValidESNs", totalAvailableValidESNs);
					
					List<BridgeSKU> bridgeSkuList = bridgeSKURepository.findAll();
					dashboardDataResultSet.put("deviceData", bridgeSkuList);
					
					dashboardDataResultSet.put("data", gridData);

					return dashboardDataResultSet;
				}
			}
		}
		return null;
	}

	public boolean stopEsnValidation() {
		stopValidationFlag = true;
		return true;
	}

}

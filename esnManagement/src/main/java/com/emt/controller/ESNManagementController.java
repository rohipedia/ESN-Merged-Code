package com.emt.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emt.common.ESNConstants;
import com.emt.exception.ApiValidationFailureException;
import com.emt.exception.ESNSuccessResponse;
import com.emt.exception.ErrorDetails;
import com.emt.exception.FileNotFoundException;
import com.emt.exception.UserNotFoundException;
import com.emt.model.EsnInfo;
import com.emt.model.User;
import com.emt.model.ValidationJob;
import com.emt.service.EsnValidationService;
import com.emt.service.ExcelService;
import com.emt.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api")
public class ESNManagementController {

	@Autowired
	private UserService userService;

	@Autowired
	private ExcelService excelService;

	@Autowired
	private EsnValidationService esnValidationService;
	
	@GetMapping(value = "/importExcel", produces = "application/json; charset=UTF-8")
	public ResponseEntity<?> importESNDataFromExcel() throws EncryptedDocumentException, InvalidFormatException, IOException, ParseException {
		log.info("Importing ESNs on"+ESNConstants.DATE_TIME);
		String result;
		ESNSuccessResponse successResponse = new ESNSuccessResponse();
		boolean response = excelService.importESN();
		if (!response) {
			log.error("File not found at the location" +ESNConstants.DATE_TIME);
			throw new FileNotFoundException("A file does not exists at the specific location");
		}
		result = (response) ? "success" : "failure";
		successResponse.setSuccessIndicator(result);
		successResponse.setTimestamp(new Date());
		return new ResponseEntity<>(successResponse, HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/validateEsn", produces = "application/json; charset=UTF-8")
	public ResponseEntity<ESNSuccessResponse> validateEsn() {
		log.info("Validating ESN on"+ESNConstants.DATE_TIME);
		ESNSuccessResponse successResponse = new ESNSuccessResponse();
		List<ValidationJob> validationJobData = Collections.emptyList();
		try{
			validationJobData = esnValidationService.validateEsn();
		} catch (Exception e) {
			log.error("Error occured while validating ESN in controller", e);
		}
		if (CollectionUtils.isEmpty(validationJobData)) {
			log.error("Esn validation failed on"+ESNConstants.DATE_TIME);
			throw new ApiValidationFailureException("All ESNs in DB at present are consumed. Click on Import Esn to import new ESNs in DB.");
		}
		log.info("Validate job completed successfully on" +ESNConstants.DATE_TIME);
		successResponse.setSuccessIndicator("Validate job completed successfully");
		successResponse.setData(validationJobData);
		successResponse.setTimestamp(new Date());
		return new ResponseEntity<>(successResponse, HttpStatus.CREATED);
	}

	/*private List<?> setValidationJobResponse(List<ValidationJob> validationJobData) {
		
		List<HashMap<String,String>> responseList = new ArrayList<>();
		validationJobData.forEach(entry->{
			HashMap<String,String> responseMap = new HashMap<>();
			responseMap.put("userName", entry.getUserForActivity().getUserName());
			responseMap.put("dateForActivity", entry.getDateForActivity().toString());
			responseMap.put("state", entry.getState().getState());
			responseMap.put("validEsnCount", String.valueOf(entry.getValidEsnCount()));
			responseMap.put("totalEsnValidated", String.valueOf(entry.getTotalEsnValidated()));
			responseList.add(responseMap);
		});
		return responseList;
	}*/
	
	@GetMapping("/refresh")
	public ResponseEntity<?> refreshValidationStatus() {
		log.info("Refreshing the progress map on"+ESNConstants.DATE_TIME);
		ESNSuccessResponse successResponse = new ESNSuccessResponse();
		List<ValidationJob> updatedValidationJobList = esnValidationService.refreshValidationStatus();
		if (!CollectionUtils.isEmpty(updatedValidationJobList)) {
			log.error("No entry found in database");
			//throw new DataNotFoundException("No Data found in tblValidationJob");
		}
		successResponse.setSuccessIndicator("Refresed the progress map successfully");
		successResponse.setTimestamp(new Date());
		successResponse.setData(updatedValidationJobList);
		return new ResponseEntity<>(successResponse, HttpStatus.CREATED);
	}
	
	@PostMapping("/dashboardData/user")
	public ResponseEntity<?> getDashboardData(@RequestBody User user) {
		log.info("Fetching tblESNInfo Data on"+ESNConstants.DATE_TIME);		
		List<EsnInfo> esnInfoData = esnValidationService.getDashboardData(user);
		if (CollectionUtils.isEmpty(esnInfoData)) {
			log.error("Fetching tblESNInfo Data failed on"+ESNConstants.DATE_TIME);
			ErrorDetails errorDetails = new ErrorDetails(new Date(), "Fetching tblESNInfo Data failed.", "Error");
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		}
		log.info("tblESNInfo Data successfully fetched on"+ESNConstants.DATE_TIME);
		ESNSuccessResponse successResponse = new ESNSuccessResponse();
		successResponse.setSuccessIndicator("tblESNInfo Data fetched successfully");
		successResponse.setTimestamp(new Date());
		successResponse.setData(esnInfoData);
		return new ResponseEntity<>(successResponse, HttpStatus.CREATED);
	}
	
	@PostMapping("/claimEsn/{device}/{esnCount}")
	public ResponseEntity<?> claimEsn(@RequestBody User user, @PathVariable String device, @PathVariable String esnCount) {
		log.info("Claiming ESNs on"+ESNConstants.DATE_TIME);
		ESNSuccessResponse successResponse = new ESNSuccessResponse();
		List<EsnInfo> claimEsnData = esnValidationService.claimEsn(user,device,esnCount);
		if (CollectionUtils.isEmpty(claimEsnData)) {
			log.error("Esn claim failed on"+ESNConstants.DATE_TIME);
			ErrorDetails errorDetails = new ErrorDetails(new Date(), "Esn claim failed.", "Error");
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		}
		log.info("Esn claimed successfully on"+ESNConstants.DATE_TIME);
		successResponse.setSuccessIndicator("Esn claimed successfully");
		successResponse.setTimestamp(new Date());
		successResponse.setData(claimEsnData);
		return new ResponseEntity<>(successResponse, HttpStatus.CREATED);
	}
	
	@GetMapping("/users")
	public ResponseEntity<?> getUsers() {
		List<User> users = userService.getUsers();
		if (CollectionUtils.isEmpty(users)) {
			log.error("No Users found");
			throw new UserNotFoundException("No Users found");
		}
		return new ResponseEntity<>(users, HttpStatus.OK);
	}

	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
		User user = userService.getUser(id);
		log.info("Fetching User record having id"+id);
		if (user == null) {
			log.error("User with id"+id+"not found");
			throw new UserNotFoundException("No Users found for id"+id);
		}
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@DeleteMapping("users/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") Long id) {
		log.info("Deleting User record for the user having id"+id);
		if (null == userService.deleteUser(id)) {
			log.error("User with id"+id+"not found");
			throw new UserNotFoundException("No User found for id"+id);
		}
		return ResponseEntity.ok().build();
	}

	@PutMapping("users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @Valid @RequestBody User user) {
		log.info("Updating User record for the user with id"+id);
		user = userService.updateUser(id, user);
		if (null == user) {
			log.error("User with id"+id+"not found");
			throw new UserNotFoundException("No Users found for ID.");
		}
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@PostMapping("/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		log.info("Creating User record for the user with id"+user);
		userService.createUser(user);
		return new ResponseEntity<>(user, HttpStatus.CREATED);
	}

	@GetMapping("/login/{userName}/{password}")
	public ResponseEntity<User> validateUser(@PathVariable("userName") String userName, @PathVariable("password") String password) {
		log.info("Fetching User record");
		User user = userService.validateUser(userName,password);
		if (user == null) {
			log.error("User with username"+userName+"not found");
			throw new UserNotFoundException("No User found for requested Username and Password.");
		}
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

}

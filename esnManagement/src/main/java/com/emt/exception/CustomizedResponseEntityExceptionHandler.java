package com.emt.exception;

import java.io.IOException;
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.emt.common.ESNConstants;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	Throwable cause = null;

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorDetails> handleAllExceptions(Exception ex, WebRequest request) {

		cause = (ex.getCause() == null) ? ex : ex.getCause();

		if (cause instanceof IOException) {
			log.debug("Processing an IO Exception on" +ESNConstants.DATE_TIME);
		} else if(cause instanceof TimeOutException){
			log.debug("Time out Exception occured on" +ESNConstants.DATE_TIME);
			ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
			return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
		} else if(cause instanceof UserNotFoundException){
			log.debug("User Not Found Exception occured on" +ESNConstants.DATE_TIME);
			ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
			return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
		} else if(cause instanceof FileNotFoundException){
			log.debug("File Not Found Exception occured on" +ESNConstants.DATE_TIME);
			ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
			return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
		} else if(cause instanceof ExcelValidationMismatchException){
			log.debug("Excel Validation Mismatch Exception occured on" +ESNConstants.DATE_TIME);
			ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		} else if(cause instanceof ApiValidationFailureException){
			log.debug("Api Validation Failure Exception occured on" +ESNConstants.DATE_TIME);
			ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		}
		ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}    
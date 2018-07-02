package com.emt.common;

import java.util.Date;

import org.apache.commons.lang.time.DateFormatUtils;

public class ESNConstants {
	
	public static final String SOURCE_PATH="src/main/resources/EsnExcelFolder/";
	public static final String DESTINATION_PATH="src/main/resources/Older/";
	public static final String EXCEL_LOCATION= "/src/main/resources/EsnExcelFolder/";
	public static final String DATE_TIME = DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:SS");
	public static final String SUCCESS = "success";
	public static final String ERROR = "error";
	public static final String VALIDATION_MESSAGE = "Device is valid and cleared for use";
	public static final String STORE_IDENTIFIER = "57957752";
	public static final String APPL_IDENTIFIER = "N01";
	public static final String APPL_PASSWORD = "c4a6qwbdul3xi01h7trg";
	public static final String RUNNING = "Running";
	public static final String BATCH_STATE_FAILURE_MESSAGE = "Prerequisite Batch State not present in the DB. Add the required 4 batch states 1.Running 2.Stopped 3.Successful 4.Failed";
	
	private ESNConstants() {
	}
}

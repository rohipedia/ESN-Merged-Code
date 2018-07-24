package com.emt.service;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.ParseException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.emt.common.ESNConstants;
import com.emt.model.ExcelDump;
import com.emt.repository.ExcelRepository;
import com.emt.utilities.ExcelUtility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ExcelService {

	@Autowired
	ExcelRepository excelRepository;

	@Autowired
	ExcelUtility excelUtility;
	
	public boolean importESN()
			throws IOException, EncryptedDocumentException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, ParseException {	
		
		List<ExcelDump> excelObj = excelUtility.excelReader();

		if (CollectionUtils.isEmpty(excelObj))
			return false;
		
		Path movefrom = FileSystems.getDefault().getPath(ESNConstants.SOURCE_PATH + excelUtility.getExcelName());
		Path target = FileSystems.getDefault().getPath(ESNConstants.DESTINATION_PATH + excelUtility.getExcelName());
		
		log.info("Moving files from"+ESNConstants.SOURCE_PATH +"to"+ESNConstants.DESTINATION_PATH);
		Files.move(movefrom, target, StandardCopyOption.REPLACE_EXISTING);
		log.info("Saving files on"+ESNConstants.DATE_TIME);
		excelRepository.saveAll(excelObj);
		log.info("Saving Completed on"+ESNConstants.DATE_TIME);
		return true;
	}	
}

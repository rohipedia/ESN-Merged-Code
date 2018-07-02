package com.emt.utilities;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.emt.common.ESNConstants;
import com.emt.exception.ExcelValidationMismatchException;
import com.emt.model.ExcelDump;
import com.emt.repository.ExcelRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ExcelUtility {

	@Autowired
	ExcelRepository excelRepository;

	File esnFile = null;
	boolean isValid = false;

	public String getExcelName() {
		return esnFile.getName();
	}

	public List<ExcelDump> excelReader() throws IOException, ParseException {

		File folderPath = new File(new ClassPathResource(ESNConstants.EXCEL_LOCATION).getPath());
		File[] fileList = folderPath.listFiles();
		if (fileList.length != 0 && fileList[0].isFile()) {
			esnFile = fileList[0];
		}

		/*
		 * Validation Rule #1 - If file exists
		 */
		if (null == esnFile || !esnFile.exists()) {
			log.error(esnFile+ " file does not exist at the specified location" +ESNConstants.EXCEL_LOCATION);
			throw new ExcelValidationMismatchException("A file does not exists at the specific location");
		}

		/*
		 * Validation Rule #2 - If file is the same file which was executed earlier
		 */

		String fileNameStr = esnFile.getName();
		String excelFileNameDateStr = fileNameStr.split("_")[2].split("\\.")[0];
		Date excelFileNameDate = new SimpleDateFormat("dd-MM-yyyy").parse(excelFileNameDateStr);

		Date currentSystemDate = new Date();

		Date excelRepoDate = null;

		List<ExcelDump> list = excelRepository.findAll();
		if (!CollectionUtils.isEmpty(list)) {
			excelRepoDate = list.get(0).getDateCreated();
		}

		if (null != excelRepoDate) {
			if (((currentSystemDate.compareTo(excelRepoDate) == 0) || (currentSystemDate.compareTo(excelRepoDate) > 0))
					&& ((currentSystemDate.compareTo(excelFileNameDate) == 0)
							|| (currentSystemDate.compareTo(excelFileNameDate) > 0))) {
				if ((excelRepoDate.compareTo(excelFileNameDate) == 0)
						|| (excelRepoDate.compareTo(excelFileNameDate) > 0)) {
					log.info("You are trying to import the file which was earlier imported on"+ excelRepoDate);
					throw new ExcelValidationMismatchException(
							"You are trying to import file :" + esnFile.getName() + "dated" + excelFileNameDate
									+ "which was sucessfully executed/imported earlier on " + excelRepoDate);
				}
			} else if ((excelFileNameDate.compareTo(currentSystemDate) > 0)) {
				log.info("You are trying to import file which is future dated with date"+excelFileNameDate);
				throw new ExcelValidationMismatchException("You are trying to import file :" + esnFile.getName()
						+ "which is future dated with date" + excelFileNameDate);
			}
		}

		Workbook workbook = null;
		List<ExcelDump> esnDump = new ArrayList<>();
		try {
			workbook = WorkbookFactory.create(esnFile);
			// Retrieving the number of sheets in the Workbook
			int numberOfSheets = workbook.getNumberOfSheets();
			log.info("Workbook -" + esnFile.getName() + " has " + numberOfSheets + " Sheets : ");

			Iterator<Sheet> sheetIterator = workbook.sheetIterator();
			log.info("Retrieving Sheets using Iterator");

			while (sheetIterator.hasNext()) {
				Sheet sheet = sheetIterator.next();
				boolean isExcelValidated = validateExcel(sheet);
				if (!isExcelValidated) {
					log.info("You are trying to import file which does not have the expected format and order");
					throw new ExcelValidationMismatchException(
							"The excel file you are trying to import doesn't have the expected format and order");
				}
				/* Truncate the Dump table */
				excelRepository.deleteAll();
				sheetReader(sheet, esnDump);
			}
		} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			log.error("Error occured while accessing the workbook of Excel file", e +"on" +ESNConstants.DATE_TIME);
		} finally {
			workbook.close();
		}

		return esnDump;
	}

	/*
	 * Validation Rule #3 - If file has the expected format and order.
	 */
	private boolean validateExcel(Sheet sheet) {
		if (null != sheet) {
			ArrayList<String> expectedRowNames = new ArrayList<>();
			expectedRowNames.add("Store");
			expectedRowNames.add("SKU Converted");
			expectedRowNames.add("ESN");
			expectedRowNames.add("SKU");
			expectedRowNames.add("ALM");
			expectedRowNames.add("Destination");
			expectedRowNames.add("upload date");
			expectedRowNames.add("Environment");
			expectedRowNames.add("Recipient");
			expectedRowNames.add("Date Given");
			expectedRowNames.add("SIM SKU");
			expectedRowNames.add("ICC_ID");

			Row row = sheet.getRow(0);
			ArrayList<String> actualRowNames = new ArrayList<>();
			row.forEach(cell -> {
				if ((cell.getStringCellValue().replaceAll("^[ \\t]+|[ \\t]+$", ""))
						.equalsIgnoreCase(expectedRowNames.get(cell.getColumnIndex()))) {
					log.info("Validating the excel header row's cell no " + cell.getColumnIndex());
					actualRowNames.add(cell.getStringCellValue());
				}
			});

			if (expectedRowNames.size() == actualRowNames.size()) {
				log.info("The file has expected format and order");
				isValid = true;
			}
		}
		return isValid;
	}

	private void sheetReader(Sheet sheet, List<ExcelDump> esnDump) {

		// obtain a rowIterator and columnIterator and iterate over them
		log.info("\n\nIterating sheet: " + sheet.getSheetName() + " using Iterator\n");

		sheet.forEach(row -> {
			if (row.getRowNum() != 0) {
				ExcelDump obj = new ExcelDump();
				log.info("Iterating row: " + row.getRowNum() + " using Iterator\n");
				// storeId
				obj.setStoreId(getStringValue(row.getCell(0)));
				// SKU
				obj.setSku(getStringValue(row.getCell(1)));
				// ESN 18
				obj.setEsn18(getStringValue(row.getCell(2)));
				// ESN 14
				// obj.setStoreId(getStringValue(row.getCell(3)));
				// IMEI 15
				// obj.setStoreId(getStringValue(row.getCell(4)));
				// Date Created
				obj.setDateCreated(new Date());
				esnDump.add(obj);
			}
		});

	}

	private String getStringValue(Cell cell) {
		DataFormatter objDefaultFormat = new DataFormatter();
		FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator(
				(XSSFWorkbook) (cell.getRow().getSheet().getWorkbook()));
		objFormulaEvaluator.evaluate(cell); // This will evaluate the cell, And any type of cell will return string value
		String result = objDefaultFormat.formatCellValue(cell, objFormulaEvaluator);
		result = result.trim().replaceAll("\u00A0",""); // This will trim all the space,tab and any non-breaking spaces.
		return result;
	}
}

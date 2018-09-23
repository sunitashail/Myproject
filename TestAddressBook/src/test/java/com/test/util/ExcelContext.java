package com.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelContext {

	private static ExcelContext excelContext = new ExcelContext();

	private AddressObj addressObj;

	private ExcelContext() {
		try {
			FileInputStream file = new FileInputStream("src\\test\\resources\\testData.xlsx");

			XSSFWorkbook workbook = new XSSFWorkbook(file);

			Sheet sheet = workbook.getSheet("testdata");

			System.out.println();

			addressObj = new AddressObj();
			

			addressObj.setTestId(sheet.getRow(1).getCell(0).getStringCellValue());
			addressObj.setFirtName(sheet.getRow(1).getCell(1).getStringCellValue());
			addressObj.setLastName(sheet.getRow(1).getCell(2).getStringCellValue());
			addressObj.setAddress(sheet.getRow(1).getCell(3).getStringCellValue());

			workbook.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ExcelContext getInstance() {
		return excelContext;
	}

	public AddressObj getAddress() {

		return addressObj;
	}

}

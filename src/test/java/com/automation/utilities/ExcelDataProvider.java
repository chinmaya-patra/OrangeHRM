package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook workbook;

	public ExcelDataProvider() {

		File src = new File("./TestData/Data1.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			 workbook = new XSSFWorkbook(fis);

		} catch (IOException e) {

			System.out.println("unable to read excel file" + e.getMessage());
		}

	}

	public String getStringData(String Sheet, int rowNo, int colNo) {
		return workbook.getSheet(Sheet).getRow(rowNo).getCell(colNo).getStringCellValue();

	}

	public double getNumericData(String Sheet, int rowNo, int colNo) {
		return workbook.getSheet(Sheet).getRow(rowNo).getCell(colNo).getNumericCellValue();

	}
}

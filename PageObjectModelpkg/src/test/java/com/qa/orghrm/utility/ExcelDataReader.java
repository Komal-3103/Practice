package com.qa.orghrm.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {

	
	private Workbook wb;
	static Sheet sheetName;
	public Row row;

	public ExcelDataReader(String sheetPath) throws IOException {
		FileInputStream fis = new FileInputStream(sheetPath);
		wb = new XSSFWorkbook(fis);

	}

	public int getRowCount(String sheet_name) {
		sheetName = wb.getSheet(sheet_name);

		int lastRowNum = sheetName.getLastRowNum();
		int firstRowNum = sheetName.getFirstRowNum();
		int TotalRows = lastRowNum;
		System.out.println(lastRowNum);
		System.out.println(firstRowNum);
		return TotalRows;

		// or

//	  int ttlRows = lastRowNum + 1;
//			return ttlRows;
//	  

	}

	public int getColumnCount() {

		row = sheetName.getRow(0);
		short lastCellNum = row.getLastCellNum();
		short firstCellNum = row.getFirstCellNum();
		int totalCountColumn = lastCellNum - firstCellNum;
		return totalCountColumn;
	}

	// to read the data from cell
	public String getCellData(int rNum, int cNum) {
		String cellVal = sheetName.getRow(rNum).getCell(cNum).getStringCellValue().toString();
		return cellVal;
	}
}

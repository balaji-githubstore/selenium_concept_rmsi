package com.rmsi.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	public static Object[][] getSheetIntoTwoDimArray(String filePath,String sheetname) throws IOException
	{
		
		FileInputStream file = new FileInputStream(filePath);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet(sheetname);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] arr = new Object[rowCount - 1][cellCount];

		DataFormatter format = new DataFormatter();
		for (int r = 1; r < rowCount; r++) {
			for (int c = 0; c < cellCount; c++) {
				arr[r - 1][c] = format.formatCellValue(sheet.getRow(r).getCell(c));
			}
		}

		book.close();
		file.close();

		return arr;
		
	}

}

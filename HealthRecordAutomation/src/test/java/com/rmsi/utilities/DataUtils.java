package com.rmsi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public Object[][] validLoginData()
	{
		Object[][] arr=new Object[2][4];
		
		arr[0][0]="admin";
		arr[0][1]="pass";
		arr[0][2]="English (Indian)";
		arr[0][3]="OpenEMR";
		
		arr[1][0]="physician";
		arr[1][1]="physician";
		arr[1][2]="English (Indian)";
		arr[1][3]="OpenEMR";
		
		return arr;
	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method mtd) throws IOException
	{
		//@Test method name is basically the sheetname 
		String testMethodName=mtd.getName();
		
		Object[][] arr= ExcelUtils.getSheetIntoTwoDimArray("test_data/openemr_data.xlsx", testMethodName);
		return arr;
	}
	
}

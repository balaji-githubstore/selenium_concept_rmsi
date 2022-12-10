package com.rmsi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rmsi.base.AutomationWrapper;

public class LoginUITest extends AutomationWrapper {
	
	@Test
	public void validateTitleTest()
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, "OpenEMR Login");
	}
	
	@Test
	public void validateHeaderTest()
	{
		String actualHeader= driver.findElement(By.xpath("//p[contains(text(),'most')]")).getText();
		Assert.assertEquals(actualHeader, "The most popular open-source Electronic Health Record and Medical Practice Management solution.");
	}

}

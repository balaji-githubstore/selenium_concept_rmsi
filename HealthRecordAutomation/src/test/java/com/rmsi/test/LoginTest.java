package com.rmsi.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.rmsi.base.AutomationWrapper;
import com.rmsi.pages.LoginPage;
import com.rmsi.pages.MainPage;
import com.rmsi.utilities.DataUtils;


public class LoginTest extends AutomationWrapper {

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void validLoginTest(String username, String password, String language, String expectedTitle) {
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.selectLanguage(language);
		
		MainPage main=new MainPage(driver);
		String actualTitle = main.getMainPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class)
	public void invalidLoginTest(String username,String password,String language,String expectedError) {
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.selectLanguage(language);

		String actualError = loginPage.getErrorMessage();
		Assert.assertEquals(actualError, expectedError);
	}

}

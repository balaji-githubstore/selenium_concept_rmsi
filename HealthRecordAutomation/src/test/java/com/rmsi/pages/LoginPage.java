package com.rmsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	private By usernameLocator=By.id("authUser");
	private By passwordLocator=By.id("clearPass");
	private By languageLocator=By.xpath("//select[@name='languageChoice']");
	private By loginLocator=By.cssSelector("#login-button");
	private By headerLocator=By.xpath("//p[contains(text(),'most')]");
	private By errorLocator=By.xpath("//div[contains(@class,'login-failure')]");

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(usernameLocator).sendKeys(username);
	}

	public void enterPassword(String password) {
		driver.findElement(passwordLocator).sendKeys(password);
	}

	public void selectLanguage(String language) {
		Select selectLan = new Select(driver.findElement(languageLocator));
		selectLan.selectByVisibleText(language);
	}

	public void clickOnLogin() {
		driver.findElement(loginLocator).click();
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public String getLoginPageHeader() {
		return driver.findElement(headerLocator).getText();
	}

	public String getErrorMessage()
	{
		return driver.findElement(errorLocator).getText();
	}
}

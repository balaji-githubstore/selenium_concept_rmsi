package com.rmsi.pages;

import org.openqa.selenium.WebDriver;

//handle all the menu
public class MainPage {

	private WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getMainPageTitle()
	{
		return driver.getTitle();
	}
	
}

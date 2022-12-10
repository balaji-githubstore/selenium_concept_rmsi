package com.rmsi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.rmsi.base.AutomationHooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	private AutomationHooks hooks;
	
	public LoginSteps(AutomationHooks hooks)
	{
		this.hooks=hooks;
	}

	@Given("I have browser with openemr page")
	public void i_have_browser_with_openemr_page() {

		WebDriverManager.chromedriver().setup();
		
		hooks.driver = new ChromeDriver();
		hooks.driver.manage().window().maximize();
		hooks.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		hooks.driver.get("http://demo.openemr.io/b/openemr");

	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		hooks.driver.findElement(By.id("authUser")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		hooks.driver.findElement(By.id("clearPass")).sendKeys(password);
	}

	@When("I select language as {string}")
	public void i_select_language_as(String language) {
		System.out.println(language);
	}

	@When("I click on login")
	public void i_click_on_login() {
		hooks.driver.findElement(By.cssSelector("#login-button")).click();
	}

	@Then("I should get access to portal with title as {string}")
	public void i_should_get_access_to_portal_with_title_as(String expectedTitle) {

		String actualTitle =hooks.driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Then("I should not get access to portal with error as {string}")
	public void i_should_not_get_access_to_portal_with_error_as(String expectedError) {
		String actualError =hooks.driver.findElement(By.xpath("//div[contains(@class,'login-failure')]"))
				.getText();
		Assert.assertEquals(actualError, expectedError);
	}

}

package com.rmsi.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.rmsi.base.AutomationHooks;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientSteps {
	
	private AutomationHooks hooks;
	
	public PatientSteps(AutomationHooks hooks)
	{
		this.hooks=hooks;
	}

	@When("I click on Patient menu")
	public void i_click_on_patient_menu() {
		hooks.driver.findElement(By.xpath("//div[text()='Patient']")).click();
	}

	@When("I click on New\\/Search menu")
	public void i_click_on_new_search_menu() {

	}

	@When("I fill the new patient form")
	public void i_fill_the_new_patient_form(DataTable dataTable) 
	{
		System.out.println(dataTable);
		
		List<Map<String, String>> lists= dataTable.asMaps();
		
		String fName=lists.get(0).get("firstname");
		String lName=lists.get(0).get("lastname");
		String dob=lists.get(0).get("dob");
		String gender=lists.get(0).get("gender");
		
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(dob);
		System.out.println(gender);
	}

	@When("I click on create new patient")
	public void i_click_on_create_new_patient() {

	}

	@When("I click on confirm create new patient")
	public void i_click_on_confirm_create_new_patient() {

	}

	@When("I store the alert text and handle it")
	public void i_store_the_alert_text_and_handle_it() {

	}

	@When("I close the happy birthday popup if available")
	public void i_close_the_happy_birthday_popup_if_available() {

	}

	@Then("I should get the added patient details as {string}")
	public void i_should_get_the_added_patient_details_as(String string) {

	}

	@Then("I should see alert text contains {string}")
	public void i_should_see_alert_text_contains(String string) {

	}

}

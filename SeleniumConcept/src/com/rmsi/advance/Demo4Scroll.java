package com.rmsi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4Scroll {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.royalcaribbean.com/account/create");
		
		driver.findElement(By.xpath("//*[contains(text(),'Month')]")).click();
		//presence of element 
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'December')]")).isDisplayed());
		
		while(!driver.findElement(By.xpath("//*[contains(text(),'April')]")).isDisplayed())
		{
			//scroll logic 
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("document.querySelector(\"div[role='listbox']\").scrollBy(0,20)");
		}
		
	}

}

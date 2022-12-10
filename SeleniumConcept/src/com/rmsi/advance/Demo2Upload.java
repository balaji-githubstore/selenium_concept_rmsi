package com.rmsi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2Upload {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.ilovepdf.com/pdf_to_word");
		

		//input[@type='file']
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Mine\\Balaji-Profile_2022.pdf");
		
		
		while(driver.findElements(By.xpath("//*[contains(text(),'December')]")).size()==0)
		{
			//scroll logic 
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("document.querySelector(\"div[role='listbox']\").scrollBy(0,20)");
		}
		
	}

}

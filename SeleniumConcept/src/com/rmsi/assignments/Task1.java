package com.rmsi.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.goto.com/meeting");
		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.linkText("Try Free")).click();
		
		//driver.findElement(By.xpath("")).sendKeys("2022-12-08");
		
		
	}

}

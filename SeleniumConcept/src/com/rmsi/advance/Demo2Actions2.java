package com.rmsi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2Actions2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://nasscom.in/");
		
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//*[text()='Membership']"))).build().perform();
		
		action.moveToElement(driver.findElement(By.xpath("//*[text()='Become a Member']"))).build().perform();
		
		driver.findElement(By.xpath("//*[text()='Membership Benefits']")).click();
		
	}

}

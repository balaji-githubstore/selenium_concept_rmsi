package com.rmsi.framedemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//switch to frame using name or id as a String 
public class Demo3Frame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://netbanking.hdfcbank.com/netbanking");
		
		driver.switchTo().frame("login_page");

		//enter customer id as test123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		//click on continue 
		driver.findElement(By.partialLinkText("CONTINUE")).click();
		//switch to the main html
		driver.switchTo().defaultContent();
		
	}
}

package com.rmsi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2SignIn {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("test123456@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("test123");
		driver.findElement(By.name("login")).click();
		
	}

}

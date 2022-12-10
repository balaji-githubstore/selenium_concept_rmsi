package com.rmsi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Php {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://phptravels.net/");
		
		String placeholder=driver.findElement(By.id("autocomplete")).getAttribute("placeholder");
		
		System.out.println(placeholder);

		//should give font type shown in UI
		driver.findElement(By.linkText("Flights")).click();
		//driver.findElement(By.xpath("//a[text()='flights']")).click();

		driver.findElement(By.id("autocomplete")).sendKeys("lax");
		driver.findElement(By.xpath("//b[text()='LAX']")).click();
		
		String textBoxValue=driver.findElement(By.id("autocomplete")).getAttribute("value");
		
		System.out.println(textBoxValue);
		
		textBoxValue=driver.findElement(By.id("fadults")).getAttribute("value");
		
		System.out.println(textBoxValue);
	
	}

}

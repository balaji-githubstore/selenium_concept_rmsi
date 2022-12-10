package com.rmsi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3SignUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("hello");

		driver.get("https://www.facebook.com/"); // wait for the page load to complete

		// click on Create New Account
		driver.findElement(By.linkText("Create New Account")).click(); // findelement checks for presence of element in
																		// 0.5s
		System.out.println("hello");
		// enter firstname as john
		driver.findElement(By.name("firstname")).sendKeys("john");

		// enter lastname as wick
		driver.findElement(By.name("lastname")).sendKeys("wick");

		// 24 Nov 2000
		Select selectDay = new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("24");

		Select selectMonth = new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Nov");

		Select selectYear = new Select(driver.findElement(By.xpath("//*[@title='Year']")));
		selectYear.selectByVisibleText("2000");

		// click on custom radio button
		driver.findElement(By.xpath("//input[@value='-1']")).click();

	}

}

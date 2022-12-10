package com.rmsi.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//click on linkedin icon 
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		//switch to 2nd tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("email-or-phone")).sendKeys("hello");
		//enter password as hello123
		//click on agree and join
		
//		driver.quit();
//		driver.close();  
//		
//		driver.switchTo().window(windows.get(0));
//		
//		System.out.println(driver.getTitle());
	}

}





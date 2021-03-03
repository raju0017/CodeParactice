package com.practies.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesHandling {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoho.com/login.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*driver.switchTo().frame("zohoiam");
		driver.findElement(By.id("lid")).sendKeys("admin");*/
		
		//or
		
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("lid")).sendKeys("admin");
		
		
		
		
		System.out.println("SUCCESS");
		driver.close();

	
	}
	
	

}

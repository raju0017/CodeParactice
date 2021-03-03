package com.practies.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		By ref = By.id("lst-ib");  // finding locator
		WebElement searchbar = driver.findElement(ref);// finding element dynamically
		// or WebElement searchbar = driver.findElement(By.id("lst-ib"));
		System.out.println(searchbar);
		
	}

}

package com.practies.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class FindingElementsUsingLocators {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("D:\\PRACTIES\\HTML\\Automation.html");
		
		WebElement username = driver.findElement(By.id("un"));
		username.sendKeys("nagaraju.mgv@gmail.com");
		
		WebElement pwd =driver.findElement(By.className("pwd"));
		pwd.sendKeys("raju0017");
		
		WebElement loginbutton = driver.findElement(By.name("button"));
		loginbutton.click();
		
		WebElement radio = driver.findElement(By.tagName("input"));
		radio.click();
		
//		WebElement linktext = driver.findElement(By.linkText("Google link"));
//		linktext.click();
		
		WebElement parlinktext = driver.findElement(By.partialLinkText("Google"));
		parlinktext.click();
		
		System.out.println("success");
		driver.close();
	}

}

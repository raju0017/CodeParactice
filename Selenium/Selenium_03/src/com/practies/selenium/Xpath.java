package com.practies.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//x-path using attribute
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("nagaraju.mgv@gmail.com");
		
		WebElement next = driver.findElement(By.xpath("//input[@id='next']"));
		next.click();
		
		WebElement password = driver.findElement(By.xpath("//*[@id='Passwd']"));
		password.sendKeys("raju0017");
		
		WebElement singnin = driver.findElement(By.id("signIn"));
		singnin.click();
		
		
		System.out.println("Success");
		
		//x-path using text function

	}

}

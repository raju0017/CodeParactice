package com.practies.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) 
	{
		WebDriver driver =  new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
		WebElement kml = driver.findElement(By.id("keepLoggedInCheckBox"));
		String text = kml.getText();
		
		System.out.println(text+"gfljl");
		
		
		
		driver.close();
		System.out.println("success");
		
	}

}

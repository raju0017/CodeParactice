package com.practies.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopupHandle {

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/eticketing/mainpage.jsf");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement loginbutton = driver.findElement(By.id("loginbutton"));
		
		Alert alt =driver.switchTo().alert();
		try
		{
			Thread.sleep(500);			
		}
		catch(Exception e){}
		alt.accept();
		/*loginbutton.click();
		try
		{
			Thread.sleep(500);			
		}
		catch(Exception e){}
		
		loginbutton.sendKeys(Keys.ESCAPE);*/
		
		driver.findElement(By.linkText("Flight Tickets")).click();
		Set<String> windowhandles =driver.getWindowHandles();
		
		Iterator<String> it = windowhandles.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		
		driver.findElement(By.id("international")).click();
		driver.close();
		
		System.out.println("SUCCESS");
		
		//driver.quit();
	}

}

package com.practies.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListofElements {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id='gs_htif0']")).sendKeys("selenium",Keys.ENTER);
		
		List<WebElement> elements = driver.findElements(By.xpath("h3[@class='r']/a"));
		for (int i = 0; i < elements.size(); i++)
		{
			WebElement ele = elements.get(i);
			System.out.println(ele.getText());
			
		}
		
	}

}

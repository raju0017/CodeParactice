package com.practies.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///D:/PRACTIES/HTML/Automation.html");
		
		
		WebElement ddl = driver.findElement(By.xpath("html/body/center/form/select[2]"));
		Select sct = new Select(ddl);
		
		boolean status = sct.isMultiple();
		if(status==true)
		{
			System.out.println("it is Multiple selector");
			
		}
		else{System.out.println("it is is Single selector");}
		
		sct.selectByIndex(0);
		sct.selectByValue("01");
		sct.selectByVisibleText("Idly");
		sct.deselectAll();
		
		
		List<WebElement> options = driver.findElements(By.xpath("html/body/center/form/select[2]/option"));
		
		for(WebElement ele: options)
		{
			System.out.println(ele.getText());
		}
		
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		
		System.out.println("SUCCESS");
		driver.close();
		
	}

}

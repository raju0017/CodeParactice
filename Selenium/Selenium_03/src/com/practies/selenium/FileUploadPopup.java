package com.practies.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/PRACTIES/HTML/Automation.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@type='file']")).click();

		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\PRACTIES\\Java\\Selenium\\AutoItScript.exe");
	
		
		System.out.println("SUCCESS");
		//driver.close();
		
		
		
	

		
	}

}

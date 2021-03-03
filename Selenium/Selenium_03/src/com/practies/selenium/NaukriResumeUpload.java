package com.practies.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriResumeUpload {

	public static void main(String[] args) throws IOException, Exception 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.naukri.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.findElement(By.id("emailTxt")).sendKeys("nagaraju.g1947@gmail.com");
		driver.findElement(By.id("usernameField")).sendKeys("nagaraju.gongolla017@gmail.com");
		//driver.findElement(By.id("pwd1")).sendKeys("king0017");
		driver.findElement(By.id("passwordField")).sendKeys("king0017");
		driver.findElement(By.xpath("(//input[@value='Login'])[1]")).click();
		
		driver.findElement(By.xpath("//*[@id='compDetail']/div[4]/div[1]/button")).click();
		driver.findElement(By.id("uploadLink")).click();
		driver.findElement(By.id("attachCV")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\PRACTIES\\Java\\Selenium\\AutoItScript.exe");
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//*[@id='editForm']/div[7]/button")).click();

		
		System.out.println("SUCCESS");
		driver.close();
		
		
		
	}

}

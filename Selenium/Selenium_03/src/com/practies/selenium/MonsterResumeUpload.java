package com.practies.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MonsterResumeUpload 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://my.monsterindia.com/login.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username_login")).sendKeys("nagaraju.g1947@gmail.com");
		driver.findElement(By.id("passwd_temp")).sendKeys("king0017");
		driver.findElement(By.cssSelector("#button")).click();
		
		/*Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		alt.dismiss();*/
		
		driver.findElement(By.cssSelector(".mn-uppf_btn.mn-eico")).click();
		driver.findElement(By.cssSelector("#edit_resume_section9_open")).click();
		driver.findElement(By.cssSelector(".txt.link.update_current")).click();
		driver.findElement(By.cssSelector("#uploadfile")).click();
		
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\PRACTIES\\Java\\Selenium\\AutoItScript.exe");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#update")).click();
		
		

		
		
		
	}

}

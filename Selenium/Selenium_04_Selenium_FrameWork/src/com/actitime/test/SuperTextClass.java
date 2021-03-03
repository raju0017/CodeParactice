package com.actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.acttime.generic.GenericUtils;

public class SuperTextClass extends GenericUtils 
{
	public WebDriver driver;
	
	@BeforeClass
	public void preCondition()
	{
		String browsername = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "config", 2, 0);
		
		String url =GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "config", 1, 1);
		
		if(browsername.equalsIgnoreCase("FF"))
		{
			driver = new FirefoxDriver();
			
			
		}
		else if (browsername.equalsIgnoreCase("GC")) 
		{
			System.setProperty("webdriver.chrome.driver", "D://STUDY/Material/Selenium/Eclipse (IDE)Environment/Selenium jars/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver", "D://STUDY/Material/Selenium/Eclipse (IDE)Environment/Selenium jars/IEDriverServer.exe");

			WebDriver driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);	
		
	}
	@AfterClass
	public void postCondition()
	{
		driver.close();
	}
	
	@Test
	public void test()
	{
		System.out.println("success");
	}

}

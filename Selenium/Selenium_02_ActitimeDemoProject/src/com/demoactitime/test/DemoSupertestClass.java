package com.demoactitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.demoactitime.generic.GenericUtils;

public class DemoSupertestClass
{
public WebDriver driver;
	
	@BeforeClass
	public void preCondition()
	{
		String browsername = GenericUtils.getExcelData("D://PRACTIES/Selenium&Java/ActitimeDemoProject/excel_lib/data.xlsx", "DemoActitime", 1, 3);
		
		String url =GenericUtils.getExcelData("D://PRACTIES/Selenium&Java/ActitimeDemoProject/excel_lib/data.xlsx", "DemoActitime", 1, 0);
		
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


	
}

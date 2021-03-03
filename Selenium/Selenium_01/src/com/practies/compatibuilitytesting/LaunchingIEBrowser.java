package com.practies.compatibuilitytesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchingIEBrowser 
{
	WebDriver driver;
	@Test
	public void launchbrowser()
	{
		System.setProperty("webdriver.ie.driver", "D://STUDY/Material/Selenium/Eclipse (IDE)Environment/Selenium jars/IEDriverServer.exe");

		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
}

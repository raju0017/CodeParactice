package com.practies.compatibuilitytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchingchromeBrowser
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D://STUDY/Material/Selenium/Eclipse (IDE)Environment/Selenium jars/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

}

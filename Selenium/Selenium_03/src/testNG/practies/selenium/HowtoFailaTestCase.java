package testNG.practies.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HowtoFailaTestCase 
{

	@Test
	public void testWebpage()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		WebElement link = driver.findElement(By.linkText("Gmail"));
		
		String actuallinktext =link.getText();
		String expectedLinktext ="Gmail";
		Assert.assertEquals(actuallinktext, expectedLinktext);
		
		System.out.println("SUCCESS");
		driver.close();
		
	}
}

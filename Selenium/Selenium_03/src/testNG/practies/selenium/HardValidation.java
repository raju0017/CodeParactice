package testNG.practies.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HardValidation
{
	WebDriver driver;

	@BeforeClass
	public void setup()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void validation()
	{
		String actualtext = driver.findElement(By.id("headerContainer")).getText();
		String exptext = "Please identify yourself";
		
		Assert.assertEquals(exptext, actualtext);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		boolean actstatus = driver.findElement(By.id("logoutLink")).isDisplayed();
		 boolean expstatus = true;
		 Assert.assertEquals(actstatus, expstatus);
		 
		 
		 System.out.println("SUCCESS");
		
	}
	@AfterClass
	public void closesetup()
	{
		driver.close();
		
	}
}

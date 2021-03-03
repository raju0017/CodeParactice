package testNG.practies.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SuperTestNGClass 
{
	public WebDriver driver;
	@BeforeClass
	public void preCondition()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			
	}
	@AfterClass
	public void postCondition()
	{
		driver.close();
	}

}

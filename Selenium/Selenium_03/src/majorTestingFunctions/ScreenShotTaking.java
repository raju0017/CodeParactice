package majorTestingFunctions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;


public class ScreenShotTaking 
{
	@Test
	public void screenShot() throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		EventFiringWebDriver event = new EventFiringWebDriver(driver);
		File scrfile = event.getScreenshotAs(OutputType.FILE);
		
		//File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("D://PRACTIES/Java/Selenium/screenshot1.png");
		FileUtils.copyFile(scrfile, dest);
		
	}
	

}

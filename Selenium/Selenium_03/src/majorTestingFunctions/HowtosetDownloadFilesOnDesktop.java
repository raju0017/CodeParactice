package majorTestingFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class HowtosetDownloadFilesOnDesktop 
{
	@Test
	public void test()
	{
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.download.folderlist", 1);
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("  ");
		
		// 0 for downloads folder, 1 for Desktop, 2 for specified foldere 
		
		// cod for specified folder
		
		FirefoxProfile profile1 = new FirefoxProfile();
		profile1.setPreference("D:PRACTIES/Java/Selenium", "path");
		profile.setPreference("browser.download.folderlist", 2);

		WebDriver driver1 = new FirefoxDriver(profile1);
		driver1.get("  ");
		
	}
	
	

}

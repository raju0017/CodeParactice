package acceptCertificates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class AcceptSSL_Certification 
{
	
	@Test
	public void test_for_FF()
	{
		
	
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		WebDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.google.com");
		
		driver.close();
	}
	
	@Test
	public void test_for_GC()
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new ChromeDriver(cap);
		driver.get("http://www.google.com");
		driver.close();
	}
	
	@Test
	public void test_for_IE()
	{
		DesiredCapabilities dcap = new DesiredCapabilities();
		dcap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new InternetExplorerDriver(dcap);
		driver.get("http://www.google.com");
		driver.close();
		
	}
	
	

}

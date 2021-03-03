package com.demoactitime.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demoactitime.generic.GenericUtils;
import com.demoactitime.pagerepo.DemoActitimeLoginPage;


public class DemoActitimeScenorio_01 extends DemoSupertestClass
{
	String un =GenericUtils.getExcelData("D://PRACTIES/Selenium&Java/ActitimeDemoProject/excel_lib/data.xlsx", "DemoActitime", 1, 1);
	String pwd =GenericUtils.getExcelData("D://PRACTIES/Selenium&Java/ActitimeDemoProject/excel_lib/data.xlsx", "DemoActitime", 1, 2);

	@Test
	public void testLoginTC_001()
	{
		DemoActitimeLoginPage lp = new DemoActitimeLoginPage(driver);
		lp.login(un, pwd);
		
		
		String actText = driver.findElement(By.linkText("Logout")).getText();
		String exptext = "Logout";
		Assert.assertEquals(actText, exptext);
	}

}

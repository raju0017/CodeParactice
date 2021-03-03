package com.actitime.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.pagerepo.LoginPage;


public class LoginSC_001 extends SuperTextClass
{
	@Test
	public void testLoginTC_001()
	{
		LoginPage lp = new LoginPage(driver);
		lp.login("admin", "manager");
		
		
		String actText = driver.findElement(By.linkText("Logout")).getText();
		String exptext = "Logout";
		Assert.assertEquals(actText, exptext);
	}

}

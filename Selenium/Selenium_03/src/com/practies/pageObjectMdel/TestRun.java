package com.practies.pageObjectMdel;

import org.testng.annotations.Test;

import testNG.practies.selenium.SuperTestNGClass;

public class TestRun extends SuperTestNGClass
{
  @Test
  public void test() 
  {
	  LoginPage lp = new LoginPage(driver);
	  lp.loginSuccess();
	  lp.loginFail();
  }
}

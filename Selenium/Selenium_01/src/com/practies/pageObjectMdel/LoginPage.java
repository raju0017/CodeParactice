package com.practies.pageObjectMdel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	 WebDriver driver;
	
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="pwd") 
	WebElement password;
	@FindBy(id="loginButton")
	WebElement loginbutton;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void loginSuccess()
	{
		driver.get("http://localhost/login.do");
		username.sendKeys("admin");
		password.sendKeys("manager");
		loginbutton.click();
	}
	
	public void loginFail()
	{
		username.sendKeys("admin");
		password.sendKeys("king");
		loginbutton.click();
	}
}


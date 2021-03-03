package com.demoactitime.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoActitimeLoginPage 
{
	WebDriver driver;
	@FindBy(name="username")
	private WebElement usernametextbox;
	
	@FindBy(name="pwd")
	private WebElement passwordtesxtbox;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	public DemoActitimeLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void login(String username, String password)
	{
		usernametextbox.sendKeys(username);
		passwordtesxtbox.sendKeys(password);
		loginbutton.click();
	}


}

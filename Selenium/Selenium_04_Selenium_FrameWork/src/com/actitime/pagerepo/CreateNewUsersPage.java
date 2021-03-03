package com.actitime.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.test.SuperTextClass;

public class CreateNewUsersPage extends SuperTextClass
{
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[1]/td[3]/input")
	private WebElement usernametextbox;
	
	@FindBy(name="passwordText")
	private WebElement passwordtextbox;
	
	@FindBy(name="passwordTextRetype")
	private WebElement passwordretypetextbox;
	
	@FindBy(name="firstName")
	private WebElement firstnametextbox;
	
	@FindBy(name="lastName")
	private WebElement lasstnametextbox;
	
	@FindBy(name="email")
	private WebElement emailtextbox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitbutton;
	
	public CreateNewUsersPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void createnewUser(String uname, String password, String fname, String lname, String email )
	{
		usernametextbox.sendKeys(uname);
		passwordtextbox.sendKeys(password);
		passwordretypetextbox.sendKeys(password);
		firstnametextbox.sendKeys(fname);
		lasstnametextbox.sendKeys(lname);
		emailtextbox.sendKeys(email);
		//submitbutton.click();
	}
	
	

}

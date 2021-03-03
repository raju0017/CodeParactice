package com.actitime.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[3]/a/img")
	private WebElement timetracktab;
	
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/img")
	private WebElement taskstab;
	
	@FindBy(xpath=".//*[@id='topnav']/tbody/tr[1]/td[9]/a/img")
	private WebElement userstab;
	@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[11]/a/img")
	private WebElement workscheduletab;
	
	@FindBy(id ="logoutLink")
	private WebElement logoutlink;
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}
	
	public void clicktaskstab()
	{
		taskstab.click();
	}
	
	public void clicktimetracktab()
	{
		timetracktab.click();
	}
	public void clickuserstab()
	{
		userstab.click();
	}
	public void clickworkscheduletab()
	{
		workscheduletab.click();
	}
	
	public void clicklogoutlink()
	{
		logoutlink.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.actitime.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasksPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//input[@value='Create New Tasks']")
	private WebElement createtasksbutton;
	
	public OpenTasksPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public  void createTasksbutton()
	{
		createtasksbutton.click();
		
	}
}

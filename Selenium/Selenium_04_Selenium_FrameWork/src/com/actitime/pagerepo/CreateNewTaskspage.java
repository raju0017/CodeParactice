package com.actitime.pagerepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewTaskspage 
{
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='container']/form[1]/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr[4]/td/table/tbody/tr[2]/td[4]/select")
	private WebElement selectcustomerMenu;
	
	@FindBy(xpath=".//*[@id='new_customer']/td[4]/input")
	private WebElement entercustomernametextbox;
	
	@FindBy(name="customerName")
	private WebElement entercustomertextfield;
	
	
	@FindBy(name="projectName")
	private WebElement projectnametextbox;
	
	@FindBy(xpath="//*[@id='task0.cell']/input[1]")
	private WebElement tasksnametextbox;
	
	@FindBy(xpath="//*[@id='task0.cell']/input[1]")
	private WebElement deadlinetextbox;
	
	@FindBy(id="ext-gen7")
	private WebElement calender;
	
	@FindBy(xpath="//input[@value='Create Tasks']")
	private WebElement createtasksbutton;
	
	public CreateNewTaskspage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void selectcusterMenu()
	{
		Select sct = new Select(selectcustomerMenu);
		
		sct.selectByVisibleText("new customer");
	}
	
	
	public void createNewTask(String custName,String projectname, String taskname)
	{
		

		Select sct = new Select(selectcustomerMenu);
		sct.selectByVisibleText("-- new customer --");
		entercustomernametextbox.sendKeys(custName);
		projectnametextbox.sendKeys(projectname);
		tasksnametextbox.sendKeys(taskname	);
		createtasksbutton.click();
	}

}

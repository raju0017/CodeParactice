package com.actitime.test;

import org.testng.annotations.Test;

import com.actitime.pagerepo.CreateNewTaskspage;
import com.actitime.pagerepo.HomePage;
import com.actitime.pagerepo.LoginPage;
import com.actitime.pagerepo.OpenTasksPage;
import com.acttime.generic.GenericUtils;

public class CreateTasksSC_002 extends SuperTextClass
{
	
	
	@Test
	public void createtasksTC_002()
	{
		String un = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateTasksSC_002", 1, 0);
		
		String pwd =GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateTasksSC_002", 1, 1);
		
		String custName = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateTasksSC_002", 1, 2);
		
		String projectname = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateTasksSC_002", 1, 3);
		
		String taskName = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateTasksSC_002", 1, 4);
		
		LoginPage lp = new  LoginPage(driver);
		lp.login(un, pwd);
		
		HomePage hp = new HomePage(driver);
		hp.clicktaskstab();
		
		OpenTasksPage otp = new OpenTasksPage(driver);
		otp.createTasksbutton();
		
		CreateNewTaskspage cntp = new CreateNewTaskspage(driver);
		
		cntp.createNewTask(custName, projectname, taskName);
		
	}
	

}


package com.actitime.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.actitime.pagerepo.CreateNewUsersPage;
import com.actitime.pagerepo.HomePage;
import com.actitime.pagerepo.LoginPage;
import com.actitime.pagerepo.UserListPage;
import com.acttime.generic.GenericUtils;

public class CreateNewUsersSC_003 extends SuperTextClass
{
	@Test
	public void createUsersTC_003() throws Exception
	{
	
		String un = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateTasksSC_002", 1, 0);
	
		String pwd =GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateTasksSC_002", 1, 1);
		String username = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateNewUsersSC_003", 1, 0);
		String password = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateNewUsersSC_003", 1, 1);
		String retypepassword = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateNewUsersSC_003", 1, 1);
		String fname = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateNewUsersSC_003", 1, 2);
		String lname = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateNewUsersSC_003", 1, 3);
		String email = GenericUtils.getExcelData("D://PRACTIES/Java/Selenium_FrameWork/excel_lib/data.xlsx", "CreateNewUsersSC_003", 1, 4);




		// for login
		LoginPage lp = new LoginPage(driver);
		lp.login(un, pwd);
	
		//for navigate to required page
	
		HomePage hp = new HomePage(driver);
		hp.clickuserstab();
		Thread.sleep(2000);
	
		//for navigate to required page

		UserListPage ulp = new UserListPage(driver);
		ulp.clickCreatenewuserbutton();
		
		//for navigate to required page
		Thread.sleep(5000);
		CreateNewUsersPage cnp = new CreateNewUsersPage(driver);
		cnp.createnewUser(username, password, fname, lname, email);
	
	
	}

}

package testNG.practies.selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class executing...");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class Executing...");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method executing...");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method executing...");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("beforetest executing...");
		
	}
	@AfterTest
	public void sftertest()
	{
		System.out.println("aftertest executing...");
	}
	@Test
	public void test()
	{
		System.out.println("test executing...");
	}
	
	
}

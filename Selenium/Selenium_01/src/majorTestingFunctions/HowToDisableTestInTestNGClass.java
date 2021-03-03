package majorTestingFunctions;

import org.testng.annotations.Test;

public class HowToDisableTestInTestNGClass 
{
	@Test
	public void a()
	{
		System.out.println("Running a method...");
	}
	@Test(enabled=false)
	public void b()
	{
		System.out.println("Running b method...");
	}
	@Test
	public void c()
	{
		System.out.println("Running c method...");
	}
	@Test(enabled=false)
	public void d()
	{
		System.out.println("Running d method...");
	}

}

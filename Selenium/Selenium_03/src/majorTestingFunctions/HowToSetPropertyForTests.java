package majorTestingFunctions;

import org.testng.annotations.Test;

public class HowToSetPropertyForTests 
{
	@Test(priority=10)
	public void a()
	{
		System.out.println("Running a method...");
	}
	@Test
	public void b()
	{
		System.out.println("Running b method...");
	}
	@Test(priority=1)
	public void c()
	{
		System.out.println("Running c method...");
	}
	@Test(priority=0)
	public void d()
	{
		System.out.println("Running d method...");
	}

}

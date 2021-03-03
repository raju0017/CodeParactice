package majorTestingFunctions;

import org.testng.annotations.Test;

public class DependencyBWTwoTests 
{
	@Test
	public void createEmployee()
	{
		System.out.println("Running create Employee....");
		
	}
	@Test(dependsOnMethods="createEmployee")
	public void deleteEmployee()
	{
		System.out.println("Running delete Employee....");

	}
}

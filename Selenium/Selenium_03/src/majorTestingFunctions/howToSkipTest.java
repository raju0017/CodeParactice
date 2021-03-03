package majorTestingFunctions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class howToSkipTest 
{
	@Test
	public void createEmployee()
	{
		System.out.println("Running create Employee....");
		
		Assert.assertEquals(true, false);
		
	}
	@Test(dependsOnMethods="createEmployee")// 
	public void deleteEmployee()
	{
		System.out.println("Running delete Employee....");

	}
}

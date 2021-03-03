package majorTestingFunctions;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation 
{
	@DataProvider
	public Object[][] data()
	{
		Object[][] obj = new Object[2][2];
		obj[0][0] = 10;
		obj[0][1] ='$';
		obj[1][0] =20;
		obj[1][1] ='*';
		
		return obj;
				
	}
	@Test(dataProvider="data")
	public void test(int x, char ch)
	{
		System.out.println(x);
		System.out.println(ch);
	}

}

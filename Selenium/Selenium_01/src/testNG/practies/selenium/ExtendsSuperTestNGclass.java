package testNG.practies.selenium;

import org.testng.annotations.Test;

public class ExtendsSuperTestNGclass extends SuperTestNGClass
{
	@Test
	public void test01()
	{
		System.out.println("Enter UN");
		System.out.println("Enter PWD");
		System.out.println("Click on Login button");
		System.out.println("verify HeomePag");
		
	}

}

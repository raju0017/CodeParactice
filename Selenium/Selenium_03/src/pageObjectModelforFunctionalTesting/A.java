package pageObjectModelforFunctionalTesting;

public class A
{
	public  A test1()
	{
		System.out.println("success.1");

		return this;
	}
	
	public  A test2()
	{
		System.out.println("success..2");

		return this;
	}
	
	public  A test3()
	{
		System.out.println("success...3");


		return this;
	}
	
	public static void main(String[] args) {
		
		A obj = new A();
		obj.test1().test2().test3();
	}
	
	

}

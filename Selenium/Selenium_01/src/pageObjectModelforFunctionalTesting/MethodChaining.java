package pageObjectModelforFunctionalTesting;

public class MethodChaining 
{
	public MethodChaining test()
	{
		return this;  // this represent current class Object always
	}
	
	
	public static void main(String[] args) 
	{
		MethodChaining obj = new MethodChaining();
		
		MethodChaining ref1 = obj.test();
		System.out.println(ref1);
		
		MethodChaining ref2 = obj.test();
		System.out.println(ref2);
		
	}

}

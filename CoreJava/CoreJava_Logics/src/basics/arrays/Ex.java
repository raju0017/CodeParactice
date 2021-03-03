package basics.arrays;public class Ex
{
	static void m1()
	{
		System.out.println("super class");
	}
	public static void main(String[] args) {
		A.m1();
	}
 
}
class A extends Ex
{
	static void m1()
	{
		System.out.println("sub class");
	}
}

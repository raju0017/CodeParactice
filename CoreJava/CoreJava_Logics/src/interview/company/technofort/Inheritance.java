package interview.company.technofort;

public class Inheritance {

	public static void main(String[] args) {
		A a = new B();
		//a.m2(); //can we call a.m2 	
	}
	
	static class A {
		public void m1()
		{
			System.out.println("class A m1 ");
		}
		
	}
	static class B extends A {
		public void m2()
		{
			System.out.println("class B");
		}
		@Override
		public void m1()
		{
			System.out.println("class b m1");
		}
	}
}

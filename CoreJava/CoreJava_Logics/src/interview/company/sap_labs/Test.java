package interview.company.sap_labs;

public class Test{ 
	
	public static void main(String[] args) {
		B a = new B();
		B b = (B)a; // I said it will cast but not cast sub class to parent class
		b.print();
	}
}

class A{
	void print()
	{
		System.out.println("Class A");
	}
}

class B extends Test{
	void print()
	{
		System.out.println("Class B");
	}
}
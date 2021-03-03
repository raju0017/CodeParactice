package interview.company.technofort;

public class TestA {
	public static void main(String[] args) {
		
		A a = new B();
		//C c = new A();
		B b = new C();
		
		a.f1();
		a.f2();
		//c.f3();
		b.f2();
		b.f1();	
		
	}
}

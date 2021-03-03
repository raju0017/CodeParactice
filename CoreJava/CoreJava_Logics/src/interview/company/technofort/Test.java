package interview.company.technofort;

public class Test {

	public static void main(String[] args) {

		A a = new B();
		// C c = new A();
		B b = new C();

		System.out.println(a.f2());
		// System.out.println(c.f1());
		System.out.println(b.f2());
		// System.out.println(c.f2());
		System.out.println(b.f1());
		System.out.println(a.f1());
	}
}

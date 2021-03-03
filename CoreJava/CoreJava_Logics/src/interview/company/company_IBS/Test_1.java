package interview.company.company_IBS;

public class Test_1 {
	public static void main(String[] args) {

		Base bc = new Child();
		bc.m1();
		bc.m2();
	}

}

class Base {
	public void m1() {
		System.out.println("base class m1 method");
	}

	public void m2() {
		System.out.println("base class m2 method");
	}

}

class Child extends Base {
	public void m1() {
		System.out.println("child class m1 method");
	}

	public void m3() {
		System.out.println("child class m3 method");
	}
}

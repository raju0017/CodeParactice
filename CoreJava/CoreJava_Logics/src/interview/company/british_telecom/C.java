package interview.company.british_telecom;

public class C implements A {
	@Override
	public int add(int a, int b) {

		int add = a+b;
		return add;
	}
	public static void main(String[] args) {
		C b = new C();
		System.out.println(b.add(5, 7));
	}

}

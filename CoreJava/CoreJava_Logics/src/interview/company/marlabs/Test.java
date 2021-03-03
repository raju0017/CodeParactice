package interview.company.marlabs;

public class Test {
	static{
		System.out.println("ststic block func1");
	}
	public int m1()
	{
		return 10;
	}
	static{
		System.out.println("ststic block func2");
	}
	public int m2()
	{
		return m1();
	}
	static{
		System.out.println("ststic block func3");
	}
	public int m3()
	{
		return m1()+m2();
	}
	public static void main(String[] args) {
		Test t = new Test();
		t.m3();
		System.out.println(t.m3());
	}

}

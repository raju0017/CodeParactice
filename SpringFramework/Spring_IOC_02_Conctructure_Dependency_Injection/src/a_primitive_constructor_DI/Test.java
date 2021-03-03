package a_primitive_constructor_DI;

public class Test {
	private String name;
	private int age;
	private String email;

	public Test(String name, int age, String email) 
	{	this.name = name;
		this.age = age;
		this.email = email;
		System.out.println("multple args constructor name, age, email");
	}

	public void printData()
	{
		System.out.println("name= "+name);
		System.out.println("age= "+age);
		System.out.println("email= "+email);
	}
	
}

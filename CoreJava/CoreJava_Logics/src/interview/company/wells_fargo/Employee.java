package interview.company.wells_fargo;

public class Employee {

	private String name;
	private int age;
	private int sal;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, int sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", sal=" + sal + "]";
	}


}

package interview.company.starMark;

public class Employee {

	Employee e1 = new Employee(); // if no-arg constructor is not there it will
								// throw compile time exception when you have 
								// arg- constructor
	Employee e2 = new Employee(1, "nagaraj");
	int id;
	String name;

	Employee(int id, String name) {
		id = id;
		name = name;
	}

	public Employee() {
	
	}

}

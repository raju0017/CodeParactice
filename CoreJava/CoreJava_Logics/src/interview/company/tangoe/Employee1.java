package interview.company.tangoe;

public class Employee1 implements Comparable<Employee1>{

	String id, name, gender;
	
	public Employee1() {

	}

	public Employee1(String id, String name, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public int compareTo(Employee1 emp) {
	
		Employee1 emp1 = new Employee1();
		return emp1.getName().compareTo(emp.getName());
	}
	
	
}

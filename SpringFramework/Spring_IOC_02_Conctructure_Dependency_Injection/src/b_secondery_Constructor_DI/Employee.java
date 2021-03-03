package b_secondery_Constructor_DI;

public class Employee {
	private int id;
	private String name;
	private Address address;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void show() {
		System.out.println(id + " " + name);
		System.out.println(address.toString());
	}

}

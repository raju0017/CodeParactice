package _04com.nag.Primary_Key_Auto_Genertors_Native_PK;

public class Student {

	private int id;
	private String name;
	private String email;
	private int marks;
	
	

	public Student(String name, String email, int marks) {
		super();
		this.name = name;
		this.email = email;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
}

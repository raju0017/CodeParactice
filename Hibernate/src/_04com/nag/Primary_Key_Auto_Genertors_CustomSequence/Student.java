package _04com.nag.Primary_Key_Auto_Genertors_CustomSequence;

public class Student {

	private Integer id;
	private String name;
	private String email;
	private Integer marks;
	
	public Student() {
	}

	public Student(Integer id, String name, String email, Integer marks) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

}

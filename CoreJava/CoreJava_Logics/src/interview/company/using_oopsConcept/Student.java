package interview.company.using_oopsConcept;

public class Student extends College {

	int rollNo;
	String name;
	String branch;
	
	
	
	public Student(int rollNo, String name, String branch) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}

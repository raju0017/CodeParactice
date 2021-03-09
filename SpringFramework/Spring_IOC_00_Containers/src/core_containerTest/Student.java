package core_containerTest;

public class Student {
	
	private Integer rollNo;
	private String name;
	
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void displayInfo(){
		System.out.println("Hello "+name+" your roll# is "+rollNo);
	}
	
}

package basics.collections;

public class Student1 {
	String name;
	int marks;
	int std;
	public Student1(String name, int marks, int std) {
		super();
		this.name = name;
		this.marks = marks;
		this.std = std;
	}
	@Override
	public String toString(){
		return "Student["+name+", "+marks+", "+std+"]";
	}
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Student)) return false;
		Student1 stu= (Student1) obj;
		return name.equals(stu.name)&& marks==stu.marks&&std==stu.std;
	}
	public int hashCode(){
		return std;
	}

}

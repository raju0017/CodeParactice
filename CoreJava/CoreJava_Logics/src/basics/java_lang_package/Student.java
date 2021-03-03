package basics.java_lang_package;

public class Student {
	
	private int rollno;
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString(){
		
		return "rollno : "+this.rollno+" name : "+this.name;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "nag");
		Student s2 = new Student(102, "king");
		
		// before overriding toString method()
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
		
		//O/P
/*		com.basics.java_lang_package.Student@659e0bfd
		com.basics.java_lang_package.Student@659e0bfd
		com.basics.java_lang_package.Student@2a139a55
		
*/	
		// After overriding toString method()
		
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
/*		
		O/P
		rollno : 101 name : nag
		rollno : 101 name : nag
		rollno : 102 name : king
	
*/	
	
	
	
		
	}
}

package basics.java_lang_package;

public class Student2 {
	
	private int rollno;
	private String name;

	public Student2() {
		// TODO Auto-generated constructor stub
	}
	
	public Student2(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o){
		
		if(o==null||!(o instanceof Student2)){
			return false;
		}
		else{
			Student2 s = (Student2)o;
			if(rollno==s.rollno && name.equals(s.name)){
				return true;
			}
			return false;
		}
		
	}
	public static void main(String[] args) {
		
		Student2 s1 = new Student2(101, "nag");
		Student2 s2 = new Student2(102, "king");
		Student2 s3 = new Student2(101, "nag");
		Student2 s4 = s1;

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
	
		
/*		// bfore overriding equals(Object o) method
		O/P
		false
		false
		true
		
		/ After overriding equals(Object o) method
		O/P
		false
		false
		true
*/	
		
	}

	

}

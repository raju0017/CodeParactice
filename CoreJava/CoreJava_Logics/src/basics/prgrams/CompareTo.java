package basics.prgrams;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Student implements Comparable{
	int rollNo;
	String name;
	int age;
	public Student(int rollNo,String name,int age) {
		this.rollNo=rollNo;
		this.name=name;
		this.age=age;
	}
	public int compareTo(Object obj){
		Student st=(Student)obj;
		if(age==st.age)
		return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
}
 class CompareTo {

	public static void main(String[] args) {
		List al=new LinkedList();
		al.add(new Student(102, "Mohan", 22));
		al.add(new Student(101, "Siva Reddy", 26));
		Collections.sort(al);
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			Student st=(Student) itr.next();
			System.out.println(st.rollNo+" "+st.name+" "+st.age);
			
		}
		
	}

}

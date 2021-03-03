package interview.company.using_oopsConcept;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		ArrayList <Student> al = new ArrayList<>();
		
		al.add(new Student(101, "abc", "Mechanical"));
		al.add(new Student(201, "king", "EEE"));
		al.add(new Student(301, "dileep", "CSE"));
		al.add(new Student(301, "dileep", "CSE"));
		al.add(new Student(401, "Hareesh", "ECE"));

		Address adr = new Address(77, "ATP", "Anantapur", "Anantapur", "Anantapur", "Andrapradesh");
		
		Collections.sort(al, new BranchSorting());
		
		for(Student st : al)
		{
			System.out.println(st.branch);
		}
		
	}
}

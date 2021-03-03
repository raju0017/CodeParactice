package interview.company.cognizant;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId(100);
		s1.setName("naga");
		
		Student s2 = new Student();
		s1.setId(100);
		s1.setName("naga");
		
		
		Set<Student> set = new HashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s2);
		set.add(s2);
		
		System.out.println(set.size());// set will ignores the duplicates
		
	}

}

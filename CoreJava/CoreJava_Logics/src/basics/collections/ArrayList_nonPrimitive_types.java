package basics.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;


public class ArrayList_nonPrimitive_types {
	
	
	public static void main(String[] args) {
		
		Student s = new Student(111, "nagaraju");
		Emp e = new Emp(222, "king");
		ArrayList al = new  ArrayList();
		al.add(10);
		al.add(20);
		al.add(e);
		al.add(s);
		System.out.println(al.toString());
		
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		Collections.reverse(al);
		System.out.println(al);
		
		
	}

}

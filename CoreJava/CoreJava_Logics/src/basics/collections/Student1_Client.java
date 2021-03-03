package basics.collections;

import java.util.HashSet;
import java.util.Set;

public class Student1_Client {

	public static void main(String[] args) {
		Set s=new HashSet();
		
		s.add(new Student1("raju", 150, 7));
		s.add(new Student1("raju", 158, 8));
		s.add(new Student1("raju", 150, 7));
		
	
		for(Object o:s){
			System.out.println(o);
		}
	}

}

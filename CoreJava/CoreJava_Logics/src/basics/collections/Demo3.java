package basics.collections;

import java.util.LinkedHashSet;
import java.util.Set;
 

public class Demo3 {

	
	// LinkedList is insertion order
	public static void main(String[] args) {
		Set s=new LinkedHashSet();
		s.add("java");
		s.add("c");
		s.add("sql");
		s.add("c++");
		s.add("android");
		for(Object i:s){
			System.out.println(i);
		}
	}

}

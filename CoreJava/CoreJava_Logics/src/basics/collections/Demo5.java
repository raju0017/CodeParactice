package basics.collections;

import java.util.Set;
import java.util.TreeSet;

public class Demo5 {

	// TreeSet is ascending order
	public static void main(String[] args) {
		Set s=new TreeSet<String>();
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

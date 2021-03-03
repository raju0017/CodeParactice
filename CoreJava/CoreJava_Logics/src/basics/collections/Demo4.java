package basics.collections;

import java.util.HashSet;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
			Set s=new HashSet();
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

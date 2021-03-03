package interview.company.softech;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(new Emp(111, 50000, "king"));
		al.add(new Emp(222, 50000, "nag"));
		al.add(new Emp(333, 50000, "raj"));
		al.add(new Emp(444, 50000, "cobra"));
		
		System.out.println("Before Sorting");
		
		for(Emp e : al)
		{
			System.out.println(e.eid+" "+e.ename+" "+e.sal+"");
		}
		
		Collections.sort(al, new Ename_Sorting_using_Comparator());
		
		System.out.println("After Sorting \n");
		
		for(Emp e : al)
		{
			System.out.println(e.eid+" "+e.ename+" "+e.sal);
		}
	}
}

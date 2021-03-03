package basics.prgrams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class NumSorting {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mohan");
		al.add("Chittam");
		al.add("Babu");
		Collections.sort(al);
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}

	}

}

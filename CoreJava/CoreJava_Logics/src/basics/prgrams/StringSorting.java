package basics.prgrams;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class StringSorting {

	public static void main(String[] args) {
		List al=new LinkedList();
		al.add("Mohan");
		al.add("Chittam");
		al.add("Anna");
		Collections.sort(al);
		Iterator itr=al.iterator();
		while (itr.hasNext()) {
			System.out.println( itr.next());
			
		}

	}

}

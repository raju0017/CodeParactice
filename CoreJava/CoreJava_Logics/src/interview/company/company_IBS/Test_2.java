package interview.company.company_IBS;

import java.util.LinkedHashSet;

public class Test_2 {
	public static void main(String[] args) {

		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("Arjun");
		lh.add("Harry");
		lh.add("Chaitanya");
		lh.add("steven");
		
		//lh.add(1);

		System.out.println(lh.remove("Chaitanya"));

		System.out.println(lh);
		


	}
	
	
}

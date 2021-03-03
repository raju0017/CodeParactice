package interview.company.ubn_swSolutions;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(1);
		
		System.out.println(hs);
	}
}

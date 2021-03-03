package interview.company.ubn_swSolutions;

import java.util.HashMap;

public class HashmapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hp = new HashMap<>();

		hp.put(1, "Original");
		hp.put(2, "nag");
		hp.put(2, "king");
		hp.put(2, "cobra");
		hp.put(1, "duplicate");

 		System.out.println(hp.get(1));
		System.out.println(hp.get(2));
	}
}

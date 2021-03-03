package interview.company.wells_fargo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CountRepeatedChars {

	public static void printRepChars(String str) {
		str.toUpperCase();
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (!hm.containsKey(ch[i])) {
				hm.put(ch[i], 1);
			} else
				hm.put(ch[i], (hm.get(ch[i])) + 1);

		}

		Set<Entry<Character, Integer>> entrySet = hm.entrySet();

		Iterator<Entry<Character, Integer>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<Character, Integer> entry = itr.next();
			int i = (int) entry.getValue();
			if ((i) > 1) {
				System.out.println(entry.getKey() + "  " + entry.getValue());
			}
		}

	}

	public static void main(String[] args) {
		CountRepeatedChars.printRepChars("jkjlkjlkjljkljl77777");
	}
}

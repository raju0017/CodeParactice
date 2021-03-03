package basics.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapDupicateTest {
	
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		
		map.put('a', 1);
		map.put('a', 2);
		map.put('a', 3);
		System.out.println(map);
		
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		ht.put("king", 1);
		ht.put("king", 2);
		ht.put("king", 4);
		System.out.println(ht);
		
		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		
		sm.put(1, "king");
		sm.put(1, "nag");
		System.out.println(sm);
		
		
	}

}

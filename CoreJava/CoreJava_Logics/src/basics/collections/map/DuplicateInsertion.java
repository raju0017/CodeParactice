package basics.collections.map;

import java.util.HashMap;
import java.util.Map;

public class DuplicateInsertion {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		//hm.put(null, "abc");
				
		hm.put(3, "abc");
		hm.put(2, "abc");
		
		hm.put(null, "bcd");
		hm.put(2, "xyz");
		System.out.println(hm);
		
		
		
		// if we add duplicate key in map it will adds the recent(last added value) and ignores the old value for that key
	}
}

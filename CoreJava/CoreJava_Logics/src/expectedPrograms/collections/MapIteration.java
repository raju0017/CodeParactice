package expectedPrograms.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteration {

	public static void main(String[] args) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		map.put('A', 1);
		map.put('B', 2);
		map.put('C', 3);
		map.put('D', 4);
		
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		
		for(Entry<Character, Integer> entry : entrySet )
		{
			if(entry.getValue()>2){
			System.out.println(entry.getKey()+"  "+entry.getValue());
			}
		}
		// OR
		Iterator<Entry<Character, Integer>> itr = entrySet.iterator();
		
		while(itr.hasNext())
		{
			Entry<Character, Integer> entry =  itr.next();
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		System.out.println(map.get('A'));
	}
	
	

}

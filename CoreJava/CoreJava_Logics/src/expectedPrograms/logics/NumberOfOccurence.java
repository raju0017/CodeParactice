package expectedPrograms.logics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberOfOccurence {

	public static void main(String[] args) {
		
		long num = 1234554332751l;
		String str = null;

		long [] array ;
		
		int value = 0;
		String str1 = "nagarajuaaaaa";
		Map<Character, Integer> m = new HashMap();
		
		for(int i = 0 ; i<= str1.length()-1; i++ )
		{
			if(m.containsKey(str1.charAt(i))){
				value++;
			}
			else {
				m.put((str1.charAt(i)), 1);
			}
			
		}
		Set<Entry<Character, Integer>> set = m.entrySet();
        List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
        for(Entry<Character, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
		
	}
}

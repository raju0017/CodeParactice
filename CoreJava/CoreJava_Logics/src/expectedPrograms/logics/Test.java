package expectedPrograms.logics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String accu = "james: is having fun at guarden";
		
		String rep = "man; can; do;";
		
		 String a = rep.replace(";", " ");
		
		 System.out.println(a);
		
		String [] strArr = accu.split(" ");
		for(String str: strArr){
			
			if(str.equalsIgnoreCase("fun")){
				System.out.println(str);
			}
		}
		
		
		String accu1 = "james: is having fun at guarden";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i<=accu1.length()-1; i++){
			
			if((map.containsKey(accu1.charAt(i)))){
				map.put(accu1.charAt(i), map.get(accu1.charAt(i))+1);
			}
			else{
				map.put(accu1.charAt(i), 1);
			}
		}
		
		Set<Entry<Character, Integer>> set = map.entrySet();
        List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
        for(Entry<Character, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
		
	}
}

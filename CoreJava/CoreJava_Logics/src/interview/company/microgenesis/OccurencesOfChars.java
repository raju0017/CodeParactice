package interview.company.microgenesis;

import java.util.HashMap;
import java.util.Map;

public class OccurencesOfChars {
	
	public static void main(String[] args) {
		String s = "AAbcdd";
		System.out.println(OccurencesOfChars.getOccurencesOfChars(s));
	}
	
	
	public static String getOccurencesOfChars(String s){
		char[] cs = s.toCharArray();
		Map<Character, Integer> hm = new HashMap<>();
		String result = "";
		for(char c : cs){
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
			}
			else{
				hm.put(c, 1);
			}
			
		}
		for(char c : hm.keySet()){
			result += c+""+hm.get(c);
		}
		return result;
	}
	
}


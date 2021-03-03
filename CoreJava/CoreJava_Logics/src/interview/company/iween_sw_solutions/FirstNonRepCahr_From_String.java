package interview.company.iween_sw_solutions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepCahr_From_String {
	
	public static void main(String[] args) {
		char c = FirstNonRepCahr_From_String.nonRepChar("entairtainment");
		System.out.println(c);
	}
	
	public static char nonRepChar(String str)
	{
		
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		
		for(int i = 0; i<ch.length; i++){
			if(!(m.containsKey(ch[i]))){
				m.put(ch[i], i);
			}
			else {
				return ch[i];
			}
		}
		return '0';
	}
}



package interview.company.technofort;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("naga");
		list.add("naga");
		list.add("naga");
		list.add("king");
		list.add("king");
		list.add("nagaraju");
		list.add("king");
		Integer count = 0;
		String str;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for (Object obj : list)
		{
			str = (String) obj;
			count = hm.get(str);
			if (count == null) 
			{
				hm.put(str, 1);

			} else {
				hm.put(str, count + 1);

			}
		}
		System.out.println(hm);

	}

}

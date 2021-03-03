package interview.company.manhattan_associates;

import java.util.ArrayList;
import java.util.List;

public class Split_String_withOut_split_method {

	public static void main(String[] args) {

		String s = "Manhattan_Associates_Development_Pvt_Ltd";
		//System.out.println(stringSplit(s, '_'));
		Split_String_withOut_split_method.stringSplit(s, '_');
	}

	public static List<String> stringSplit(String str, char delimiter) {

	        List<String> list = new ArrayList<String>(); // list is used to store the words
	        int i, start = 0, end = 0;
	        for (i = str.indexOf(delimiter); i != -1; i = str.indexOf(delimiter, i+1)) {
	            end = i;
	            list.add(str.substring(start, end)); // by using substring we can get the one word
	            start = i+1;
	        }
	    
	        list.add(str.substring(end+1)); // this is used to add the last word
	        System.out.println(list); // print the list
	        
	        // Converting list to array of strings
	        String words[] = (String[]) list.toArray(new String[list.size()]);
	        for (String word : words) {
	            System.out.println(word.trim());
	        }
		return list;
	}

}

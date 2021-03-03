package interview.company.company_IBS;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class Counting_Vowels_inFile {
	public static void vowels_count(){
	try{	File f = new File("F:\\JavaWorkSpace\\Interview\\RealTime_Programs\\src\\company_IBS\\vowels.txt");
		    Scanner input = new Scanner(f);
		    String fileContent = "";
		    while (input.hasNext()){
		        fileContent += input.next() + " ";
		    }
		    input.close();
		    char[] charArr = fileContent.toCharArray();
		    
		    int a = 0; int e = 0; int i = 0; int o = 0; int u = 0;
		    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		    for (char c : charArr){
		    	switch (c){
		    	case 'a': case 'A':
		    	a++; break;
		    	case 'e': case 'E':
		    	e++; break;
		    	case 'i': case 'I':
		    	i++; break;
		    	case 'o': case 'O':
		    	o++; break;
		    	case 'u': case 'U':
		    	u++; break;
		        }
		    }
		    map.put('a', a);
		    map.put('e', e);
		    map.put('i', i);
		    map.put('o', o);
		    map.put('u', u);
		    System.out.println("The file has AEIOU values " + map + " times");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Counting_Vowels_inFile.vowels_count();
	}

}

package expectedPrograms.logics;

import java.util.Scanner;

public class FindDistinctChar {
	
	public static void main(String[] args) {
		
		System.out.println("Enter String");
		Scanner scn = new Scanner(System.in);
		String str1 = scn.next();
		String s = "";
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			if (s.indexOf(c) == -1)
				s += c;
		}
		System.out.println(s);
	}
}
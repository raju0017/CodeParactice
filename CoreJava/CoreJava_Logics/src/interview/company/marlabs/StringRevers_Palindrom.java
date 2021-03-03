package interview.company.marlabs;

import java.util.Scanner;

public class StringRevers_Palindrom {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String");
		String original = scn.next();
		String revers ="";
		for (int i = original.length()-1; i >= 0; i--) {
			revers += original.charAt(i);
		}
		if(original.equals(revers))
		{
			System.out.println("given String is POLINDROM");
		}
		else {
			System.out.println("given String is not POLINDROM");
		}
	}
}

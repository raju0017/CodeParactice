package expectedPrograms.logics;

import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter word to check palindrom or not");
		String original = scn.nextLine();
		String reverse = "";
		String name= "Giddaiah";
	
		System.out.println(name.toUpperCase());
		
		for (int i = original.length() - 1; i >= 0; i--) {
			reverse += original.charAt(i);
		}

		if (original.equals(reverse))
			System.out.println("entered word is polindrom");
		else
			System.out.println("entered word is not polindrom");
		scn.close();
	}
		
}
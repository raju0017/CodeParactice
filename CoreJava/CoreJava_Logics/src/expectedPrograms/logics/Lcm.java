package expectedPrograms.logics;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		int min;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter two numbers for finding LCM");
		int a = scn.nextInt();
		int b = scn.nextInt();
		min = (a > b) ? a : b;
		
		while (true) {
			
			if (min % a == 0 && min % b == 0) {
				System.out.println("LCM IS  " + min);
				break;
			} else
				min++;
		}
	}

}

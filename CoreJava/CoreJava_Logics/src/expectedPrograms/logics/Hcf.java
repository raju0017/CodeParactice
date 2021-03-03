package expectedPrograms.logics;

import java.util.Scanner;

public class Hcf {
	public static void main(String[] args) {
		int max;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter two numbers for finding HCF");
		int a = scn.nextInt();
		int b = scn.nextInt();
		max = (a > b) ? a : b;
		while (true) {
			if (a % max == 0 && b % max == 0) {
				System.out.println("HCF IS  " + max);
				break;
			} else
				max--;
		}
	}

}

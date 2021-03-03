package expectedPrograms.logics;

import java.util.Scanner;

public class Prime {
	public static boolean prime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number");
		int n = scn.nextInt();

		if (Prime.prime(n)) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("number is not a prime");
		}
		
		scn.close();
	}
}

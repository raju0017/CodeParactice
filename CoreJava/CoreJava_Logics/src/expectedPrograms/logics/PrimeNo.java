package expectedPrograms.logics;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter No to check prime or not");
		int n = scn.nextInt();
		int a = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				a = 1;
				break;
			}
		}
		if (a == 1) {
			System.out.println(n + " is not prime");
		} else {
			System.out.println(n + " is prime");
		}
	}

}

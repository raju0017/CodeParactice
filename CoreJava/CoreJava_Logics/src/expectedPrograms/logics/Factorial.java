package expectedPrograms.logics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter No for finding Factorial");
		int n = scn.nextInt();
		int factorial = 1;

		for (int i = 1; i <= n; i++) {

			factorial *= i;

		}
		System.out.println("Factorial of Given no " + n + " is :" + factorial);

	}

}

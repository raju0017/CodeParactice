package basics.patterns;

import java.util.Scanner;

public class Rightangle_Traingle {
	public static void traingle() {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = scn.nextInt();

		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		traingle();
	}

}

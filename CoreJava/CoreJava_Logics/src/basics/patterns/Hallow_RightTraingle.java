package basics.patterns;

import java.util.Scanner;

public class Hallow_RightTraingle {
	public static void traingle() {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = scn.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (j == 1 || i == rows || i == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		traingle();
	}

}

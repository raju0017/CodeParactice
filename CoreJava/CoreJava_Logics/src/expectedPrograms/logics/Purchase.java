package expectedPrograms.logics;

import java.util.Scanner;

public class Purchase {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int p;
		
		do {
			System.out.println("Select items");
			System.out.println("enter 1-banana: 2-apple");
			int n = scn.nextInt();

			switch (n) {
			case 1:
				System.out.println("banana");
				break;
			case 2:
				System.out.println("apple");
				break;
			default:
				System.out.println("invalid entry please choose 1 or 2");
				// break;
			}
			if (n == 1 || n == 2)
				System.out.println("enter how many kgs");
			int m = scn.nextInt();
			if (n == 2) {
				System.out.println("value= :" + m * 20);
			} else if (n == 1) {
				System.out.println("value= :" + m * 10);
			}
			System.out.println("Enter 3 -continue any Num for Exit");
			p = scn.nextInt();

		} while (p == 3);
		System.out.println("Thank you for Purchasing...Exited");
	}
}

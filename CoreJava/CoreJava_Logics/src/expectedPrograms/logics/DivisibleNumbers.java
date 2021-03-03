package expectedPrograms.logics;

import java.util.Scanner;

public class DivisibleNumbers {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number for finding divisible numbers upto 100 ");
		int n = scn.nextInt();

		for (int i = 1; i <= 100; i++) {
			if (n % i == 0)
				System.out.println(i);
		}
	}

}

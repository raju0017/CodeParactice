package expectedPrograms.logics;

import java.util.Scanner;

public class RecurseReverseDemo {
	
	// A method for reverse
	public static void reverseMethod(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		} else {
			System.out.print(number % 10);
			// Method is calling itself: recursion
			reverseMethod(number / 10);
		}
	}

	public static void main(String args[]) {
		int num = 0;
		System.out.println("Input your number and press enter: ");
		Scanner scn = new Scanner(System.in);
		num = scn.nextInt();
		System.out.print("Reverse of the input number is:");
		reverseMethod(num);
	}

}

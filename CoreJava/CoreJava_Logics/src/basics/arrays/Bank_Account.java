package basics.arrays;

import java.util.Scanner;

public class Bank_Account {

	int accNo;
	double bal;

	void getBal() {
		System.out.println("bal=" + bal);
	}

	void withDraw(double amt) {

		if (bal >= amt) {
			bal -= amt;
			System.out.println("bal withdrawn");

		} else {
			System.out.println("insufficient bal");

		}
	}
}

class Atm {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Bank_Account a1 = new Bank_Account();
		a1.accNo = 100;
		a1.bal = 4000;
		int n;
		do {
			System.out.println("1-view bal");
			System.out.println("2-withDraw Bal");
			System.out.println("enter ur option");
			int input = scn.nextInt();

			switch (input) {
			case 2:
				System.out.println("enter amt");
				double amt = scn.nextDouble();
				a1.withDraw(amt);
				break;
			case 1:
				a1.getBal();
			default:
				System.out.println("invalid input");

				break;
			}
			System.out.println("1-continue;0-exit");
			n = scn.nextInt();

		} while (n == 1);
		System.out.println("THANQUE");
	}
}

package basics.prgrams;


import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1.      Number is prime or not");
		System.out.println("2.      Print Prime Numbers");
		System.out.println("Enter Choice:");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:

			System.out.println("Enter Number:");
			int num = sc.nextInt();
			if (isPrime(num))
				System.out.println("num is prime");
			else
				System.out.println("num is not prime");
			break;
		case 2:
			System.out
					.println("Enter Number upto which u want to print prime numbers:");
			int num1 = sc.nextInt();
			for (int i = 2; i <= num1; i++) {
				if (isPrime(i))
					System.out.print(i + ", ");
			}
			break;
		default:
			System.out.println("sorry wrong input");
		}

	}

	public static boolean isPrime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}

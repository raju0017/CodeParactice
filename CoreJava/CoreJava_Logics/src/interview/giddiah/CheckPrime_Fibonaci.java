package interview.giddiah;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckPrime_Fibonaci {

	public static int check(int number) {

		boolean isPrime = true;
		boolean numIsFib = false;
		int fib;
		List<Integer> fibList = new ArrayList<Integer>();
		int f = 0, s = 1;
		fibList.add(f);
		fibList.add(s);

		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		// if number is prime only checking for fibonaci
		if (isPrime) {
			for (int j = 2; j <= number; j++) {

				fib = f + s;
				fibList.add(fib);
				f = s;
				s = fib;
				if (fibList.contains(number)) {	
					numIsFib = true;
					break;
				}
			}

		} else {
			return 1;
		}
		
		// if number is fibonaci tehn returning 0
		if(numIsFib){
			return 0;
		}
		// returning 1
		else return 1;

	}
	// for testing the code
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter No to check prime and fibonaci");
		int number = scn.nextInt();
		
		int res = check(number);
		
		System.out.println("Return code is :"+res);
	}
}

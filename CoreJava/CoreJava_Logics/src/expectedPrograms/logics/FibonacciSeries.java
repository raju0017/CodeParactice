package expectedPrograms.logics;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size for finding fibonacci Series ");
		int n = scn.nextInt();
		int f = 0;
		int s = 1;
		int fib;
		System.out.print(f + " , " + s + " , "); 

		for (int i = 2; i <= n; i++) {

			fib = f + s;
			System.out.print(fib + " , ");
			f = s;
			s = fib;

		}
		
	}

}

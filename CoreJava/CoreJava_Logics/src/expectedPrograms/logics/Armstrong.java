package expectedPrograms.logics;

public class Armstrong {
	public static void main(String[] args) {
		
		// example 153 is Armstrong 153=1^3+5^3+3^3 

		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("enter 3digit number");
		int n = scn.nextInt();
		int orig = n;

		int sum = 0, reminder = 0;
		while (n != 0) {
			
			reminder = n % 10;
			
			sum = sum + reminder * reminder * reminder;
			n = n / 10;
			

		}
		if (sum == orig) {
			System.out.println("number is Armstrong");
		} else {
			System.out.println("number is not Armstrong");
		}
	}
	
	
	/* --   % is a modulo operator , It give remainder of two numbers on division as result 
				and discard quotient and gives an integer
	
			eg. 11%4=3
			
			
		/ is a division operator , it give quotient of two numbers on division as result and gives a 
		  		floating point number.

		eg. 11/4=2.75
	
	*/

}

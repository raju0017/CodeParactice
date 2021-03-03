package basics.prgrams;

import java.util.Scanner;

public class DivisibleNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number for finding divisible numbers upto 100 ");
		int n = scn.nextInt();
		
		for (int i = 1; i <=50 ; i++)
		{
			if(i%n==0) 
				System.out.println(i);
		}
	}

}

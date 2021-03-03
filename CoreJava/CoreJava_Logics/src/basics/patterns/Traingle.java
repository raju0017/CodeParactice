package basics.patterns;

import java.util.Scanner;

public class Traingle {
	public static void traingle() {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows = scn.nextInt();

		for (int i = 1; i <= rows; i++) 
		{
			for (int j = 1; j <= i + rows - 1; j++)
			{
				if (i + j >=rows + 1) 
				{
					System.out.print("*");
				} 
				else
				{
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

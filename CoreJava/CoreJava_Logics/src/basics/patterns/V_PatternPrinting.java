package basics.patterns;

import java.util.Scanner;

public class V_PatternPrinting {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter matrix row");
		int r = scn.nextInt();
		int count = 0, count1 = 0;
		int[][] arr = new int[r][r];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < r; j++) {
				arr[i][j] = ++count;
				System.out.print(count + "  ");
			}
			System.out.println();
		}

		for (int i = 0, j = 0; i < r; i++) 
		{
			if (i == r - 1)
			{
				int k = i - 1;
				System.out.print(arr[i][j]);

				for (j = 1; j < r; j++, k--)
				{
					System.out.print(arr[k][j]);
				}
			} 
			else 
			{
				System.out.print(arr[i][j]);
			}

		}

	}

}

package interview.company.centuryLink;

import java.util.Scanner;

public class Top2MaxNumFromArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = scn.nextInt();
		int[] arr = new int[size];
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i = 0; i<size; i++)
		{
			System.out.println("Enter index "+i+" value");
			arr[i] = scn.nextInt();
			
			if(max1< arr[i])
				max1 = arr[i];
			{	max2 = max1;
			}
		}
		
		System.out.println(max1+" "+ max2);
		
		
	}
}

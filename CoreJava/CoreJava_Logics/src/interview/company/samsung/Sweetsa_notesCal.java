package interview.company.samsung;

import java.util.Scanner;

public class Sweetsa_notesCal {
	public static void main(String[] args) {

		System.out.println("Enter no of test cases");
		System.out.println("enter no of notes and cost of sweet in first line");
		System.out.println("enter note values in second line");

		Scanner scn = new Scanner(System.in);
		int cases = scn.nextInt();
		int[] result = new int[cases];
		
		while(cases>0){
			int sum = 0, div=0, mod=0, min=1000;
			int notes = scn.nextInt();
			int cost = scn.nextInt();
			for(int i=0; i<notes; i++)
			{
				int value = scn.nextInt();
				sum+=value;
				if(min>value)
				{
					min=value;
				}
			}
			div=sum/cost;
			mod = sum%cost;
			
			for(int j=0; j<cases;j++)
			{
				if(mod>=min)
				{
					result[j]= -1;
				}	
				else result[j]= div;
			}
			cases--;
		}
		for(int l= result.length; l>0; l--)
		{
			System.out.println(result[l-1]);
		}

	}
}

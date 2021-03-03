package expectedPrograms.logics;
import java.util.Scanner;

public class MinDistanceGlobusSoft {

	public static void main(String[] args) {

		System.out.println("enter number of lines");
		Scanner scn=new Scanner(System.in);
		int lines=scn.nextInt();
		int arr1[]=new int[lines];
		int arr2[]=new int[lines];
		for(int i=0;i<lines;i++)
		{
			System.out.println("enter cordinate points (example (01))");
			int points=scn.nextInt();
			arr1[i]=points/10;
			arr2[i]=points%10;
		}
		for(int i=0;i<lines;i++)
		{
			int minDistance=100;
			for(int j=0;j<lines;j++)
			{
				if(i==j) continue;
				int distance=get(arr1[i],arr1[j])+get(arr2[i],arr2[j]);
				if(minDistance>distance)
					minDistance=distance;
			}
			System.out.println(minDistance);
		}
		
	}
	public static int get(int a, int b)
	{
		if(a>b)
			return a-b;
		else return b-a;
	}

}

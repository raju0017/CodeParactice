package basics.prgrams;

import java.util.Scanner;

public class EmployeeRecords {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Howmany employees?  :");
	   final int n=scn.nextInt();
		EmployeeDetails N []=new EmployeeDetails[n];
		for (int i = 0; i < n; i++) {
			N [i]= new EmployeeDetails();
		}
		for (int i = 0; i < n; i++) {
			
			System.out.println("Entry no  :"+(i+1)+ "/" +n);
			N[i].getData();
		}
		System.out.println("---OUTPUT-----");
		for (int i = 0; i <n; i++) {
			N[i].showData();
		}
	}
}


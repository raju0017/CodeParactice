package interview.giddiah;

import java.util.Scanner;

public class LargestFiboOfRange {
	
	public static void main(String[] args) {
		
System.out.println("Enter two number to print Largest Number Between range");

		Scanner scn = new Scanner(System.in);
		
		int startNum = scn.nextInt();
		int endNum = scn.nextInt();
		
		int f=0, s=1, res=0;
		while(s<=endNum){
			int val =  f+s;
			f=s;
			s=val;
			if(val>=startNum && val<=endNum && isOdd(val)){
				res= val;
			}
		}
		
		System.out.println(res);
	}
	
	public static boolean isOdd(int num){
		
		return (num & 1) == 1; 
	}

}

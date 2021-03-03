package interview.giddiah;

import java.util.Scanner;

public class PrintingRange {
	
	public static void main(String[] args) {
		
		System.out.println("Enter two number to print range between numbers : ");
		
		Scanner scn = new Scanner(System.in);
		
		int startNum = scn.nextInt();
		int endNum = scn.nextInt();
		
		//System.out.println(startNum+"  "+endNum);
		
		for(int i = startNum; i<=endNum; i++){
			
			if(i%3==0 && i%7 ==0){
				System.out.println("CLOUDNIX");
			}
			else if(i%3==0){
				System.out.println("CLOUD");
			}
			else if(i%7 ==0){
				System.out.println("NIX");
			}
			else System.out.println(i);
		}
	}

}

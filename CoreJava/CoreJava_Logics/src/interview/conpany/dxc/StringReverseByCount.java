package interview.conpany.dxc;

import java.util.Scanner;

public class StringReverseByCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String for revers");
		String input = sc.next();
		
		System.out.println(input);
		
		System.out.println("Enter number of Charecters to shift");
		Integer count = sc.nextInt();
		System.out.println(count);
		String output= "";
		for(int i = input.length(); i<=0; i--){
			
			while(count>0){
				output +=input.charAt(i);
				count--;
			}
			
		}
		System.out.println(output);	
	}
}

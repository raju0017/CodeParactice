package basics.prgrams;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("enter string");
		String s= scn.next();
		String s1=s.toLowerCase();
		int count=0;
		
		int n=s.length();
		for (int i = 0; i < n; i++) {
			char c=s1.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
				
			}
			
		}
		System.out.println(count);
	}

}

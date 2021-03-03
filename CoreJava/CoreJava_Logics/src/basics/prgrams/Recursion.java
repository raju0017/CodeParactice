package basics.prgrams;


import java.util.Scanner;

public class Recursion {
	int sum=0;
	
	public void show(int n){
		if(n>=1){
		
		int  i=n%10;
		
		sum=sum + i;
		show(n/10);
		}
		Scanner sc=new Scanner("System.in");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		Recursion r=new Recursion();
		r.show(n);
		System.out.println(r.sum);
	}
}

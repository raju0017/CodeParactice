package expectedPrograms.logics;


import java.util.Scanner;
public class SumOfString {
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter Alphanumeric string");
		String str=scn.next();
		System.out.println(getSum(str));
	}
	
	public static int getSum(String s){
		if(s==null) return 0;
		int i, sum=0;
		for( i=0; i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0' && c<='9')
			{
				sum+=Integer.parseInt(""+c);
			}
		}
		return sum;
	}
}
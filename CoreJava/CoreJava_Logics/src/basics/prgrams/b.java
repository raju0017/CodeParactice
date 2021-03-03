package basics.prgrams;

class B//reverse number 
{
	public static void main(String[] args) 
	{
		java.util.Scanner scn=new java.util.Scanner(System.in);
		System.out.println("Enter number for showing revers ");
		long num=scn.nextLong();
		long temp=0;
		long revNum=0;

		while (num>0)
		{

		temp=num%10;
		revNum=revNum*10+temp;
		num=num/10; 
		}
		System.out.println("Reversed number is "+revNum);
	}

}

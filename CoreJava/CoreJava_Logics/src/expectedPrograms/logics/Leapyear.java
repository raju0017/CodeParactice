package expectedPrograms.logics;

import java.util.Scanner;

public class Leapyear 
{
	public static void main(String[] args)
	{
		System.out.println("Enter year");
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		
		  if(((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0))
		  {
              System.out.println("Year " + year + " is a leap year");

		  }
		  else
		  {
			  System.out.println("Year " + year + " is not a leap year");

		  }
		
		
	}

}

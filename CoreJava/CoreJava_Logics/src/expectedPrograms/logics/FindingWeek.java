package expectedPrograms.logics;

import java.util.Scanner;

public class FindingWeek {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Ente day Number for Finding week");
		int day = scn.nextInt();
		
	
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesay");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
		break;
		default:
			System.out.println("invalid entry please choose 1 to 7");
		}
	}
}

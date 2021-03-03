package expectedPrograms.logics;

import java.util.Scanner;

public class TablesGeneric {

	public static void main(String[] args) {
		
		System.out.println("Enter which table you want");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 1; i <= 10; i++) {

			System.out.println(n + "*" + i + "=" + n * i);

		}
	}

}

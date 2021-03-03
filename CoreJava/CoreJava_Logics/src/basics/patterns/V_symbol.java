package basics.patterns;import java.util.Scanner;

public class V_symbol {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row size");
		int a = sc.nextInt();
		System.out.println("Enter b row size");
		int b = sc.nextInt();
		int c[][] = new int[a][b];
		
		//Taking elements from the user
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				c[i][j] = sc.nextInt();
			}

		}
		//  Displaying the elements what we taken from the user
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println("");
		}
	//  This is output logic in V shape
		System.out.println("This is output logic in V shape");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (j == 0 || i+j==2) {
					System.out.print(c[i][j]);

				}else{
					System.out.print(" ");
				}

			}System.out.println("");
		}
		
		//  This is output logic of V shape what we wanted in single line
		System.out.println("This is output logic of V shape what we wanted in single line");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (j == 0) {
					System.out.print(c[i][j]);

				}

			}
		}
		System.out.print(c[2][0]-2);
		System.out.print(c[2][0]-4);
		

	}
}

package basics.patterns;
public class Rectangular {
	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j <= 6; j++) {
				if (j == 0 || i == 0 || j == 6 || i == 6 || i == j || i + j == 6) {
					if (i != 3 || j != 3) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				} else {
					System.out.print("  ");
				}

			}
			System.out.println(" ");
		}

	}
}

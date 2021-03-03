package basics.patterns;

public class Pattern2_00 {
	public static void main(String[] args) {
		String s = "QJSPIDERS";
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (i == j || i + j == 8) {
					System.out.print(s.charAt(c));
				} else
					System.out.print(" ");
			}
			c++;
			System.out.println();

		}
	}
}
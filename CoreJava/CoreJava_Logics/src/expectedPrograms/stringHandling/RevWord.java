package expectedPrograms.stringHandling;

public class RevWord {

	public static void main(String[] args) {

		String s1 = "java is very easy";
		
		String[] s2 = s1.split(" ");

		StringBuilder sb = new StringBuilder();

		for (int i = s2.length - 1; i >= 0; i--) {
			sb.append(s2[i] + " ");
			// sb.append(" ");
		}
		String s3 = sb.toString().trim();

		System.out.println("Actual Styring  :" + s1);

		System.out.println("revers String   :" + s3);

	}
}

package expectedPrograms.logics;

public class LetterInString {

	public static void main(String[] args) {
		String s = "nagaraju";

		System.out.println(s.length() - s.replace("a", "").length());
	}

}

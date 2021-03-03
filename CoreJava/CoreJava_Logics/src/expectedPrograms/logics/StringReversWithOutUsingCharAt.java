package expectedPrograms.logics;

public class StringReversWithOutUsingCharAt {

	public static void main(String[] args) {
		String s = "nagaraju";
		char[] arr = s.toCharArray();
		int l = arr.length;

		String str = "";
		String s1 = "";
		for (int i = l - 1; i >= 0; i--) {
			str += String.valueOf(arr[i]);

		}
		System.out.println(str);
	}
}

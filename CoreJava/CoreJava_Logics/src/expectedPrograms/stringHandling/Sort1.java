package expectedPrograms.stringHandling;

import java.util.Arrays;

public class Sort1 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 9, 7, 3, };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n===============");
		
		String[] str = { "java", "sql", "c" };
		Arrays.sort(str);
		for (String s : str) {
			System.out.print(s+" ");
		}
	}

}

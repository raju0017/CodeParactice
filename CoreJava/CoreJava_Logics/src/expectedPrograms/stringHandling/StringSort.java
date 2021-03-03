package expectedPrograms.stringHandling;

public class StringSort {
	
	public static void strSort(String[] a) {
		
		String temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				
				if (a[j].compareTo(a[j + 1]) > 0) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		String[] str = { "java", "sql", "c++" };
		strSort(str);
		for (String s : str) {
			System.out.println(s);
		}
	}

}

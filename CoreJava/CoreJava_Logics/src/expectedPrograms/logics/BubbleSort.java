package expectedPrograms.logics;

public class BubbleSort {
	public static void bSort(int[] a) {

		int temp;
		for (int i = 0; i < a.length - 1; i++) 
		{
			for (int j = 0; j < a.length - 1 - i; j++) 
			{
				if (a[j] > a[j + 1]) 
				{
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 8, 7, 6, 5, 4, 3, 2, 1 };
		bSort(a);
		for (int n : a) {
			System.out.print(n+" ");
		}
	}

}

package expectedPrograms.logics;

public class Finding_Largest_and_SmallestNo_inArrya {
	public static void main(String[] args) {

		int[] arr = new int[] { 20, 40, 50, 10 };
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		System.out.println("Largest number = " + largest + " smallest number = " + smallest);

	}
}

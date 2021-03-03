package expectedPrograms.logics;

public class Bignum_from_Array {

	public static void main(String[] args) {

		int[] arr = { 20, 10, 30, 40, 5, 50};
		int big = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > big)
				big = arr[i];

		}
		System.out.println("big num is : " + big);

	}
	
	//***********  OR ********************//
	/*public class Big {

		public static void main(String[] args) {
			int [] arr={10,15,20,70,56};
			int big=0;
			for(int element :arr)
			{
				if(element>big) big=element;
			}
			System.out.println("Big element is "+big);
		}
	*/
}

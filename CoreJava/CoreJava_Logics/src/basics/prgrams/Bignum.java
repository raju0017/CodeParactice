package basics.prgrams;

public class Bignum {

	public static void main(String[] args) {
		int[] arr={20,10,30,40,5};
		int big=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]>big) big=arr[i];
			
		}
		System.out.println("big num is :"+big);
		
	}

}

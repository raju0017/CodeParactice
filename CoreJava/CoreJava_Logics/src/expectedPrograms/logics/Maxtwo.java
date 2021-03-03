package expectedPrograms.logics;
public class Maxtwo {
	public static void main(String[] args) {
		int arr[]= {1,2,533,687,1,21,2};
		int max1=0;
		int max2=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
				
			}
			
			
		}
		System.out.println("max1="+max1+" max2="+max2);
	}

}

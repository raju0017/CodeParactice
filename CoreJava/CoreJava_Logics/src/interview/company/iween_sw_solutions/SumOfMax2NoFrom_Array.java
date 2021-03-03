package interview.company.iween_sw_solutions;

public class SumOfMax2NoFrom_Array {

	public static void main(String[] args) {
			
		int[] arr = {1, 4, 6, 8, 8};
		Long l = SumOfMax2NoFrom_Array.sum(arr);
		System.out.println(l);
		
	}
	
	public static long sum(int[] arr)
	{
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]>max1)
			{
				max2 = max1;
				max1 = arr[i];
				
			}
			
			
		}
		return max1+max2;
	}
}

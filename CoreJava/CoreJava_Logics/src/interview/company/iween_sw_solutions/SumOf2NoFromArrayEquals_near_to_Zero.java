package interview.company.iween_sw_solutions;

public class SumOf2NoFromArrayEquals_near_to_Zero {

	public static void main(String[] args) {
		
		int[] arr = {-3, 4, -7, 8, 23};
		SumOf2NoFromArrayEquals_near_to_Zero.sumof2Num(arr);
	}
	
	public static void sumof2Num(int[] arr)
	{
		int m1 = 0, m2 = 0;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length-1; j++)
			{
				System.out.println(i+" "+j+"  sum "+arr[i]+arr[j]);
				if(arr[i]+arr[j]<=0)
				{
					m1 = arr[i];
					m2 = arr[j];
				}
			}
		}
		
		System.out.println("the two numbers are  "+ m1+ " "+ m2);
	}
}

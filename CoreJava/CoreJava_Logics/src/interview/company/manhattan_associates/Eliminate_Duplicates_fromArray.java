package interview.company.manhattan_associates;

public class Eliminate_Duplicates_fromArray {
	
	public static void main(String[] args) {
		int[] a = { 3, 3, 3, 2, 3, 3, 3, 5, 8, 3,2};
		String str = "king";
		System.out.println(str.length()+"   "+ a.length);
		
		int flag = 0;
		for (int i = 0; i <= a.length - 1; i++) 
		{
			flag = 0;
			for (int j = i + 1; j <= a.length - 1; j++) 
			{
				System.out.println(i+" "+j);
				if (a[i] == a[j]) 
				{
					flag++;
				}
 
			}
			if (flag == 0) 
			{
				System.out.print(a[i] + ", ");
			}

		}
		

	}
}

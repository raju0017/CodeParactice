package expectedPrograms.logics;

public class LinearSearch {
	
	public static int linearSearch(int[] a,int search)
	{
		for(int i=0; i<a.length; i++)
		{
			if(search==a[i]) return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int[] a={10,30,4,3,43,67,60};
		System.out.println(linearSearch(a, 67));
	}

}

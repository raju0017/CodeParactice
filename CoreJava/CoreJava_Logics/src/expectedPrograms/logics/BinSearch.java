package expectedPrograms.logics;
public class BinSearch {
	
	public static int binarySearch(int[] a, int search)
	{
		
		int f=0;
		int l=a.length-1;
		int m=(f+l)/2;
		
		while(f<=l)
		{
			if(search==a[m]) return m;
			else if(search>a[m]) f=m+1;
			else{
				l=m-1;
			}
			m=(f+l)/2;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] a={10,20,30,40,50};
		System.out.println(binarySearch(a, 70));
	}

}

package basics.patterns;

public class Spiral_Printing {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		serialPrint(0, 0, arr);
	}
	
	public static void serialPrint(int m, int n, int[][] a)
	{
		int i, k=0, l=0;
		/* k = starting row index
		 * l = starting column index
		 * m = ending row index
		 * n = ending column index
		 */
		
		while(k<m && l<n)
		{
			// printing first row from the remaining rows
			for(i = l; i < n; i++ )
			{
				System.out.print(a[k][i]);
			}
			k++;
			
			// printing last columns from the remaining columns
			for(i = k; i < m; i++)
			{
				System.out.print(a[i][n-1]);
			}
			n--;
			// printing last rows from the remaining rows
			if(k < m)
			{
				for(i = n-1; i >=l; i--)
				{
					System.out.print(a[m-1][i]);
				}
				m--;
				
				// printing first columns from the remaining columns
				if(l < n)
				{
					for(i = m-1; i >=k; i--)
					{
						System.out.print(a[i][l]);
					}
					l++;
				}
			}
		}
		
	}
}

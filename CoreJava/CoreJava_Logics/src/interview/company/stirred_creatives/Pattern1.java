package interview.company.stirred_creatives;

public class Pattern1 {
	public static void main(String[] args) {
		int i, j,k;
		for(i = 5; i >= 1; i--)
		{
			for(j = 1; j <= 5; j++ )
			{
				if(j<=i)
				System.out.print(j);
				else
				System.out.print(" ");
			}
			
			for(j = 4; j>=1; j--)
			{
				if(j<=i)
					System.out.print(j);
					else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("\n success");
	}
}

/*
1  2  3  4  5  4  3  2  1
1  2  3  4     4  3  2  1
1  2  3           3  2  1
1  2                 2  1
1                       1
*/
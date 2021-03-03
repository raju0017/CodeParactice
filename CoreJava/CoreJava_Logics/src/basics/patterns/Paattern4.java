package basics.patterns;public class Paattern4 {

	public static void main(String[] args) {
		String s="jspiders";
		int n=s.length();
		for(int i=0; i<n; ++i)
		{
			for(int j=i; j<n; j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i; k++)
			{
				System.out.print(s.charAt(k)+" ");
			}
			System.out.println();
		}
		
	}

	}



package basics.patterns;
public class Pattern3_00 {

	public static void main(String[] args) {
		String s="jspiders";
		int n=s.length();
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}

}

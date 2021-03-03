package basics.patterns;
public class Pattern1_001 {

	public static void main(String[] args) {
		String s="Jspiders";
		int i;
		for(i=0; i<s.length()-1; i++);
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		
	}

}

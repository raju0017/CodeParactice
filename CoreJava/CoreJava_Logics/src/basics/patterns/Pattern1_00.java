package basics.patterns;
public class Pattern1_00 {

	public static void main(String[] args) {

		
		String str="jspiders";
		for(int i=0;i<str.length();i++)
		{
			int c=0;
			for(int j=0;j<str.length();j++)
			{
				if(i+j>=7) 
					{
					System.out.print(str.charAt(c++)+" ");
					}
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}

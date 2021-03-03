package basics.patterns;
public class Pattern2_002
{
	public static void main(String[] args)
	{
		String s="JSPIDERS";
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i;j<s.length()-1; j++)
			{
				System.out.print(" ");
				
			}
				for(int k=0; k<=s.length(); k++)
				{
					System.out.println(s.charAt(k));
				}
		}
		System.out.println();
	}
}
package basics.patterns;
public class Distinct {
	public static String getDistinct(String s)
	{
		StringBuilder s1=new StringBuilder();
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if(s1.toString().indexOf(c)==-1) s1.append(c);
		}
		return s1.toString();
	}

	public static void main(String[] args) {
		
		String str="abcdab";
		String res=getDistinct(str);
		System.out.println(res);
	}

}


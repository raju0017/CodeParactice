package basics.prgrams;

public class Distinct {
	
	public  String getDistinct(String s)
	{
		String s1=" ";
		for (int i=0; i<s.length(); ++i)
		{
			char c=s.charAt(i);
			if(s.indexOf(c)==-1) s1+=c;
					
		}
		return s1;
	}

	public static void main(String[] args) {
		Distinct d=new Distinct();
		
		System.out.println(d.getDistinct("abcdab"));
		
	}

}

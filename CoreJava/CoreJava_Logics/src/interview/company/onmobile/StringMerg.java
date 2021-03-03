package interview.company.onmobile;

public class StringMerg {

	static String mergedString = null;
	public static String merge(String str1, String str2)
	{
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		String temStr = null;
		int length1 = char1.length;
		int length2 = char2.length;
		int length;
		if(length1>length2)
		{
			length = length1;
		}
		else length =length2;
	
		for(int i = 0; i<length; i++)
		{
			for(int j = 0; j < length1; j++)
			{
				temStr += char1[i]; 
			}
		} 
		
		return mergedString;
	}
}
/*

String str1 = "naga";
String str2 = "8969654"
merge = n8a9g6a9654

*/
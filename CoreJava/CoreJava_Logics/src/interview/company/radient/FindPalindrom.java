package interview.company.radient;

public class FindPalindrom {

	public static String palinddrom(String str){
		
		String temp ="";
		for(int i =str.length()-1; i>=0;i--){
			temp += str.charAt(i);
		}
		if(temp.equals(str))
		{
			return "reverse String is Palindrom ;"+temp;			
		}
		else {
			return "reverse String is not Palindrom ;"+temp;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(palinddrom("Nagaraju"));
		System.out.println(palinddrom("madam"));
	}
}

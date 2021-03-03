package basics.prgrams;

public class StringRevPalindrome {
					
	public static void main(String[] args) {
		
		
		
		String s="mohan";
		String s2="";
		char c[]=new char[s.length()];
		char c1;
		
		
		for(int i=s.length()-1,j=0;i>=0;i--,j++){
			c[j]=s.charAt(i);
		}
		for(int i=0;i<=s.length()-1;i++){
			s2=s2+c[i];
		}
		
		if(s.equals(s2)){
			System.out.println("palindrome");
		}else{
			System.out.println("not palindrome");
		}

	}

}

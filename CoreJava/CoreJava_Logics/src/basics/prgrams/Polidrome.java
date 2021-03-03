package basics.prgrams;

public class Polidrome {
	
	public static boolean polin(String s){
		if(s==null) return false;
		StringBuilder sb=new StringBuilder();
		int n=s.length();
		for(int i=n-1;i>=0;i-- ){
			sb=sb.append(s.charAt(i));
			
		}
		if( sb.toString()==s)
		return true;
		else return false;
	}
	

	public static void main(String[] args) {
		System.out.println(polin("madam"));
	}

}

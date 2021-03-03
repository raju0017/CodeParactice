package basics.prgrams;

public class RevNumber {
	public static void main(String[] args) {
		/*StringBuffer n= new StringBuffer("123");
		n.reverse();
		System.out.println(n);*/
		int n=5689;
		while(n>=1){
		int s=n%10;
		n=n/10;
		System.out.print(s);
		}
	}
}

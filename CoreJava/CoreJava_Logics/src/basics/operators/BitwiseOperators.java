package basics.operators;

public class BitwiseOperators {
	
	public static void main(String[] args) {
		
		// &, | and ^ are bitwise operators
		
		int x =10;
		int y = 15;
		
		System.out.println(x&y);
		System.out.println(x|y);
		System.out.println(x^y);
		
		//short circute operators
		
		System.out.println(false&true);
		
		if(++x >10  & ++y<20){
			
			System.out.println(x+" "+y);
		}
	}

}

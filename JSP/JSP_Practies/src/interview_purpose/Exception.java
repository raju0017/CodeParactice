package interview_purpose;

public class Exception {

	public static void main(String[] args) {

		int a = 10;
		int b =  0;
		int c = a/b;
		try {
			System.out.println(c);
		} catch (ArithmeticException e) {
			
			System.out.println("exception");
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		System.out.println("success");
		
	}

}

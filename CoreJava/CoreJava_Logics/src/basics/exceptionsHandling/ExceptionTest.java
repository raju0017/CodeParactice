package basics.exceptionsHandling;

public class ExceptionTest {

	public static void validate(int age) throws InvalidAgeException{
		if(age<18){
	
			throw new InvalidAgeException("not valid age");
		}
		
		System.out.println("wel come to Election commission");
	}
	
	public static void main(String[] args) {
		try {
			validate(20);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

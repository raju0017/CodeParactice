package basics.exceptionsHandling;

public class ExceptionTest2 {

	public static void validate(int age){
		if(age<18){
			throw new InvalidAgeException2("Age is not valid");
		}
		
		System.out.println("wel come to Election commission");
	}
	
	public static void main(String[] args) {
		validate(25);
	}
}

package interview.company.sapience;

public class PassByvVal_PassByRef {
	
	// Java is Strictly Pass by Value!
	
	public static int process(Integer i){
		 System.out.println("Entered method (value = " + i + ")");
		    i = 50;
		    System.out.println("Changed value within method (value = " + i + ")");
		    System.out.println("Leaving method (value = " + i + ")");
		//i= 20;
		return i;
	}
	
	
	public static void main(String[] args) {
		
		int someValue = 7;
		System.out.println("Before calling process value = " + someValue);
		PassByvVal_PassByRef.process(someValue);
		System.out.println("After calling method value = " + someValue);
	}

}

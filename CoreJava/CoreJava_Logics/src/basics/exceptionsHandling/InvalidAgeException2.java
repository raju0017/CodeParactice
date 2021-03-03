package basics.exceptionsHandling;

public class InvalidAgeException2 extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidAgeException2(String str) {
		super(str);
	}
	
}

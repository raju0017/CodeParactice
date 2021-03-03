package business;

public class AcnoNotFoundException extends RuntimeException {

	@Override
	public String toString() {
		return "Account number not valid";
	}

}

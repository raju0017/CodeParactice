package interview.company.intelizign;

public class Exception1 {

	public static void main(String[] args) {
		try {
			throw new Error();
		}

		catch (Exception e) {
			System.out.println("Error catched");
		}

		/*
		 * catch(Error e){ System.out.println("Error catched"); }
		 */
		finally {
			System.out.println("finally block");
		}
	}

}

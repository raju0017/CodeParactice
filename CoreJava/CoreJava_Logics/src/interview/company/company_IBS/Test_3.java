package interview.company.company_IBS;

public class Test_3 {
	public static void main(String[] args) {
		assert false;
		try
		{
			System.out.println("RunTimeExcepyion");
		}
		catch(RuntimeException e)
		{
			System.out.println(" Exception");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		
	}

}

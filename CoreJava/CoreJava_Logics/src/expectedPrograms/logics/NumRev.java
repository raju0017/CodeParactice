package expectedPrograms.logics;

public class NumRev {
	public static long numRev(long number)
	{
		long reverse =0;
		long reminder;
		
		while(number>0)
		{
			reminder = number%10;
			number = number/10;
			reverse =reverse*10+reminder;
		}
		return reverse;
	}
	
	
	public static void main(String[] args) {
		System.out.println(numRev(123));
		
		System.out.println("success");
	}
}

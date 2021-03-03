package method_replacer;

public class Bank {
	private int accNo;
	private int amount;
	
	public int deposite(int amt)
	{
		amount+=amt;
		System.out.println(amount);
		return amount;
	}
	public void withDraw(int amt)
	{
		amount-= amt;
		System.out.println(amount);
	}
	
	public void rateOfInterest()
	{
		System.out.println("12%");
	}
}



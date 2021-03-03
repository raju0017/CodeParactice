package business;

public class Bank {
	int amount = 5000;
	String acno = "sbi123";
	public int deposite(String acno, int amount)
	{
		if(acno.equals(this.acno))
		{	
			System.out.println("in deposite method..");
			this.amount = this.amount+amount;
			return this.amount;
		}
		else
		{
			throw new AcnoNotFoundException();
		}
	}
	
}

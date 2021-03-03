package autowiring;

public class Bus {
	private Engine engname;
	
	public Bus() {
		System.out.println(" dfault Bus constructor..");
	}
	public Bus(Engine engname)
	{
		System.out.println("Bus parameterised constructor..");
		this.engname = engname;
	}
	
	public void setEngname(Engine engname) {
		System.out.println(" setter Engine..");
		
		this.engname = engname;
	}	
	public void printData()
	{
		System.out.println("Bus Engine modelyear ="+engname.getModelyear() );
	}	
}

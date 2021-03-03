package autowiring;

public class Car {
	private Engine engname;
	
	public void setEngname(Engine engname) {
		this.engname = engname;
	}
	public void printdata()
	{
		System.out.println(" Car modelyear= "+engname.getModelyear());
	}
	public Car(Engine engname) {
		super();
		this.engname = engname;
	}
	
	
}

package b_seconderyType_DI;

public class Car {
	private String carname;
	private Engine engine;
	
	public Car() {
		System.out.println("Car..");
	}
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printData()
	{
		System.out.println("carName= "+carname);
		System.out.println("modelyear="+engine.getModelyear());
	}

}

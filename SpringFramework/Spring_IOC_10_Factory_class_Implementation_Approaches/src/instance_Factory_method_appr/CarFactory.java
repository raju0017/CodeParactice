package instance_Factory_method_appr;

public class CarFactory {
	private String carname;
	
	private CarFactory()
	{
		
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}

	public Car getCar() throws Exception
	{
		Car c = (Car) Class.forName(carname).newInstance();
		return c;
	}
	
	
}

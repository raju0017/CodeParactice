package framework;


public class CarFactory {
	private static String carname;
	
	private CarFactory()
	{
		
	}
	public static void setCarname(String carname) {
		CarFactory.carname = carname;
	}

	public static Car getCar() throws Exception
	{
		Car c = (Car) Class.forName(carname).newInstance();
		return c;
	}
}

package static_variable_DI;


public class Car {
	
	private static String carname;
	private static String carModel;

	public static void setCarModel(String carModel) {
		Car.carModel = carModel;
	}

	public static void setCarname(String carname) {
		Car.carname = carname;
	}

	public static void printCar() {
		System.out.println("carName:= " + carname+"caMr model : "+carModel);
	}
}

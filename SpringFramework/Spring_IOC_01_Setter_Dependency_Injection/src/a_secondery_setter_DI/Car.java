package a_secondery_setter_DI;

public class Car {
	private String carname;
	private Engine engine;

	public final String getCarname() {
		return carname;
	}

	public final void setCarname(String carname) {
		this.carname = carname;
	}

	public final Engine getEngname() {
		return engine;
	}

	public final void setEngname(Engine engine) {
		this.engine = engine;
	}

	public void display() {
		System.out.println("carname :" + carname);
		System.out.println("model year :" + engine.getModelyear());
	}

}

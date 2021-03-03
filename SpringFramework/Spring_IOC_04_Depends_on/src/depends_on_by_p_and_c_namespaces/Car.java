package depends_on_by_p_and_c_namespaces;

public class Car {
	private String carname;
	private Engine engine;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String carname, Engine engine) {
		super();
		this.carname = carname;
		this.engine = engine;
	}


	public final String getCarname() {
		return carname;
	}

	public final void setCarname(String carname) {
		this.carname = carname;
	}

	public final Engine getEngine() {
		return engine;
	}

	public final void setEngine(Engine engine) {
		this.engine = engine;
	}
	public void printdata(){
		System.out.println(carname+" "+engine.getModelyear());
	}
	

}

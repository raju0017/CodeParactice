package l_seconderyType_Array_DI;

public class Car {
	private String[] carnames;
	private Engine[] enginenames;
	public Car() {
	}
	
	
	public String[] getCarnames() {
		return carnames;
	}


	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}


	public Engine[] getEnginenames() {
		return enginenames;
	}


	public void setEnginenames(Engine[] enginenames) {
		this.enginenames = enginenames;
	}


	public void printcarData()
	{
		for(String car :carnames)
		{
			System.out.println(car);
		}
		for(Engine e : enginenames)
		{
			System.out.println(e.getModelyear());
		}
	}
}

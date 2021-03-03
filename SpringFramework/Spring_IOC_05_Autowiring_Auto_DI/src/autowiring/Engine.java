package autowiring;

public class Engine {
	private String modelyear;
	
	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}
	public String getModelyear() {
		return modelyear;
	}
	public Engine(String modelyear) {
		super();
		this.modelyear = modelyear;
	}
	
	
	
}

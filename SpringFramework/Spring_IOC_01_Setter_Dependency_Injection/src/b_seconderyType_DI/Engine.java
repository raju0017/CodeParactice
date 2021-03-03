package b_seconderyType_DI;

public class Engine 
{
	private String modelyear;
	public Engine() {
		
		System.out.println("Engine..");
	}
	
	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}
	public String getModelyear() {
		return modelyear;
	}

}

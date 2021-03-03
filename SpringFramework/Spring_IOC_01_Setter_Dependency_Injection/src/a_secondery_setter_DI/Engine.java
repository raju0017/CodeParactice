package a_secondery_setter_DI;

public class Engine {
	private String modelyear;

	public Engine() {

	}

	public final String getModelyear() {
		return modelyear;
	}

	public final void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}

}

package sterotype_Component_Annotation;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String modelyear;
	public Engine() {
	}
	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}
	public String getModelyear() {
		return modelyear;
	}

}

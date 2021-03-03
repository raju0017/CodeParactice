package autowire_by_Annotations1;

import org.infinispan.factories.annotations.Inject;

public class Car {
	
	private Engine engname;
	
	public Engine getEngname() {
		return engname;
	}

	@Inject
	public void setEngname(Engine engname) {
		this.engname = engname;
	}

	public void printdata()
	{
		System.out.println("modelyear= "+engname.getModelyear());
	}

}

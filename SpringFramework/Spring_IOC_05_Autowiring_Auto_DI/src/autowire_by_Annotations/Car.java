package autowire_by_Annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier("e1")
	private Engine engname;
	
	
	public void printdata()
	{
		System.out.println("modelyear= "+engname.getModelyear());
	}

}

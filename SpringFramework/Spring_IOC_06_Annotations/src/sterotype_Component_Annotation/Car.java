package sterotype_Component_Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Car {

	@Autowired(required = true)
	@Qualifier(value = "e")
	private Engine engname;
	public void printData()
	{
		System.out.println(engname.getModelyear());
	}
}

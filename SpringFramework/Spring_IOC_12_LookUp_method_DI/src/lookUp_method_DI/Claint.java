package lookUp_method_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lookUp_method_DI.Car;

public class Claint {

	public static void main(String[] args)
	{
		ApplicationContext apc = new ClassPathXmlApplicationContext("lookUp_method_DI/spring.xml");
		Car c = (Car)apc.getBean("c");
		System.out.println(c.myCarEngine().getName());
		System.out.println(c.getClass().getCanonicalName());
	}

}

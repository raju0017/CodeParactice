package b_seconderyType_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import b_seconderyType_DI.Car;

public class Claint {

	public static void main(String[] args)
	{
		String[] files = new String[] {"b_seconderyType_DI/engine.xml","b_seconderyType_DI/car.xml"};
		ApplicationContext apc = new ClassPathXmlApplicationContext(files);
		Car  c=(Car)apc.getBean("c");
		c.printData();
	}

}
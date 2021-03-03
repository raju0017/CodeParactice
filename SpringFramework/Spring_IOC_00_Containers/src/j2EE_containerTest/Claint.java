package j2EE_containerTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Claint {

	public static void main(String[] args)
	{
		ApplicationContext apc = new ClassPathXmlApplicationContext("j2EE_containerTest/spring.xml");
		
		apc.getBean("t");
		apc.getBean("t");
		apc.getBean("t");
		
		//checks xml document
		//it will creates istances for singleton beans 
		
	}

}

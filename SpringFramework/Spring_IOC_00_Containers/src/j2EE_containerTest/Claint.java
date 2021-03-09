package j2EE_containerTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Claint {

	public static void main(String[] args)
	{
		ApplicationContext apc = new ClassPathXmlApplicationContext("j2EE_containerTest/spring.xml");
		
		Student student = (Student)apc.getBean("student");
		student.displayInfo();
		
	}

}

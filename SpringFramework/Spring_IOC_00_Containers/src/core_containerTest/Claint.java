package core_containerTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Claint {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("core_containerTest/spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(r);
		
		boolean contains = beanFactory.containsBean("st");
		System.out.println("bean id with st present "+contains);

		Student student = (Student)beanFactory.getBean("st");
		Student student1 = beanFactory.getBean("st", Student.class);
		student.displayInfo();
		student1.displayInfo();
	}
}

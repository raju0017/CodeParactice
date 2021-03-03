package core_containerTest;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Claint {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("core_containerTest/spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(r);

		beanFactory.getBean("t");
		beanFactory.getBean("t");

	}
}

package a_primitive_setter_DI;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import a_primitive_setter_DI.Test;

public class Claint {

	public static void main(String[] args) {
		
		Resource r = new ClassPathResource("a_primitive_setter_DI/spring.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		Test t = (Test) bf.getBean("t");
		t.printData();
	}
}
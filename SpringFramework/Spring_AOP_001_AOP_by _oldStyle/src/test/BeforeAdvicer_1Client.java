package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import business.A;

public class BeforeAdvicer_1Client {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("resources/beforeAdvicer1.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		A a = factory.getBean("proxy", A.class);
		System.out.println("proxy class name: " + a.getClass().getName());
		a.m();
	}
}

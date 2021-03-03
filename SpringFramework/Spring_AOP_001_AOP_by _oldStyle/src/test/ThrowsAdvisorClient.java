package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import business.A;
import business.Validator;

public class ThrowsAdvisorClient {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("resources/throwsAdvisor.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Validator v = factory.getBean("proxy", Validator.class);
		try {
			v.validate(12);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

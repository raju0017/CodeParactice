package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import dao.EmployeeDao;
import model.Employee;

@SuppressWarnings("deprecation")
public class Client {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("resources/applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		EmployeeDao dao = (EmployeeDao) factory.getBean("d");

		Employee e = new Employee();
		e.setId(115);
		e.setName("kiran");
		e.setSalary(50000);

		// dao.saveEmployee(e);
		dao.updateEmployee(e);
	}

}

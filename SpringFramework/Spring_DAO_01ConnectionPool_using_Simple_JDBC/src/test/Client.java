package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.StudentBoImpl;
import model.Student;

public class Client {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/test.xml");
		StudentBoImpl stbo = (StudentBoImpl)cap.getBean("bo");
		int i =stbo.createStudent(new Student(111,"naga","naga@gmail.com","hyd"));
		System.out.println(i);
		cap.close();	
	}
}

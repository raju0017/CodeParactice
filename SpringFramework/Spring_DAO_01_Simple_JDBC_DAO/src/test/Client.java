package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDaoImpl;
import model.Student;

public class Client {
	
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");
		StudentDaoImpl stdaoimpl = (StudentDaoImpl)cap.getBean("dao");
		int i =stdaoimpl.save(new Student(223,"naga","naga@gmail.com","hyd"));
		System.out.println(i);
		cap.close();
		
	}

}

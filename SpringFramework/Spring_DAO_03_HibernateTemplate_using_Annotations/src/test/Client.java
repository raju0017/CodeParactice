package test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import business.StudentBoImpl;
import dao.StudentDao;
import model.Student;

public class Client {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/test.xml");
		StudentDao dao = (StudentDao)cap.getBean("dao");
		Student st = new Student();
		st.setId(333);
		st.setName("nagaraj");
		st.setEmail("nagaraj@gmail.com");
		st.setAddress("kurnool");
		dao.save(st);
		System.out.println("success");
		cap.close();
	}
}

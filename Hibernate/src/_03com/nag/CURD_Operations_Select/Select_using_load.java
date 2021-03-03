package _03com.nag.CURD_Operations_Select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import _03com.nag.CURD_Operations_Insert.Student;


public class Select_using_load {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_03com/nag/CURD_Operations__Delete/delete.hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();// not required for select operations
		
		System.out.println("student is calling with load() method");
		Student std=(Student)s.load(Student.class, 444);
		System.out.println("student is called with load() method");
		System.out.println(std.getId());
		System.out.println(std.getName());// here query will fire  i.e lazy loading
		System.out.println(std.getEmail());
		System.out.println(std.getMarks());

		s.close();
		sf.close();
		
		
		System.out.println("data selected successfully");
		
	}

}

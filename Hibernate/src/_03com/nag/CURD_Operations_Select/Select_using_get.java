package _03com.nag.CURD_Operations_Select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Select_using_get {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_03com/nag/CURD_Operations_Select/select.hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();// not required for select operations
		
		System.out.println("student is calling with get() method");
		
		
		Student std=(Student)s.get(Student.class, 111);// here only Query will fire
		
		System.out.println("student is called with get() method");
		System.out.println(std.getId());
		System.out.println(std.getName());
		System.out.println(std.getEmail());
		System.out.println(std.getMarks());

		
		s.close();
		sf.close();
		
		
		System.out.println("data retrived successfully");
		
	}

}

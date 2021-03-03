package _00com.nag.basics;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		// Creating Cinfiguration object 
		Configuration config = new Configuration();
		config.configure("_00com/nag/basics/hibernate.cfg.xml");
		
		// getting SessionFactory from Connection Object
		SessionFactory sf = config.buildSessionFactory();
		
		// getting Session from SessionFactory Object
		Session session = sf.openSession();
		
		// starting Transaction 
		Transaction tr = session.beginTransaction();
		
		
		Student s = new Student(); // transient state of object
		
		s.setSid(111);
		s.setSname("Nagaraju");
		s.setSclass("Btech");
		
		session.save(s); // persistent state of object -- the object will save in first level cache
	
		tr.commit();
		session.close();
		sf.close();
		//session.evict(s); // detached state of object
		
		
		
	}
}

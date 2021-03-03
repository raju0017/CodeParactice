package _04com.nag.Primary_Key_Auto_Genertors_Increment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Increment_Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_04com/nag/Primary_Key_Auto_Genertors_Increment/increment.hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		Student st = new Student("BBB", "BBB@gmail.com", 400);

		int pk = (Integer) s.save(st);
		System.out.println("returned value from save() method "+pk);
		t.commit();
		s.close();
		sf.close();

		
		System.out.println("tables created successfully");

	}

}

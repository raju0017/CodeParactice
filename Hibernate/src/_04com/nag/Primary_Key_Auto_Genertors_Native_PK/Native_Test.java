package _04com.nag.Primary_Key_Auto_Genertors_Native_PK;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Native_Test {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("_04com/nag/Primary_Key_Auto_Genertors_Native_PK/native.hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Student st = new Student("ccc", "ccc@gmail.com", 500);
		
		int pk = (Integer)s.save(st);
		t.commit();
		
		s.close();
		sf.close();
		
		System.out.println("Returned Serializble Object :"+pk);
		System.out.println("table created successfully using native PK Genarator");
		
		
	}

}

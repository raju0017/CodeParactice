package _04com.nag.Primary_Key_Auto_Genertors_Sequence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SequenceTest {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("_04com/nag/Primary_Key_Auto_Genertors_Sequence/sequence.hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Student st = new Student("kkk", "kkk@gmail.com", 500);
		
		int pk = (Integer)s.save(st);
		t.commit();
		
		s.close();
		sf.close();
		
		System.out.println("Returned Serializble Object :"+pk);
		System.out.println("table created successfully using sequence PK Genarator");
		
		
	}

}

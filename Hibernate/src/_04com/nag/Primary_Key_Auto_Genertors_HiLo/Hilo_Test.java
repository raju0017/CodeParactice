package _04com.nag.Primary_Key_Auto_Genertors_HiLo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hilo_Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_04com/nag/Primary_Key_Auto_Genertors_HiLo/hilo.hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		BookMove bm = new BookMove();
		//bm.setId(102); it wont insert
		bm.setMove("KGF");
		bm.setShowtime("2 PM");
		bm.setSeatno(100);

		int pk = (Integer) s.save(bm);

		System.out.println(" Returned Serializable Object : "+pk);
		t.commit();

		s.close();
		sf.close();

		System.out.println("insertion Successfully using PK Generator hilo");
	}

}

package _03com.nag.CURD_Operations__Delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeleteClient {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_03com/nag/CURD_Operations__Delete/delete.hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		// Create student object
		Student st = new Student();
		st.setId(111);

		s.delete(st);
		t.commit();
		s.close();
		sf.close();

		System.out.println("data deleteted success");
	}
}

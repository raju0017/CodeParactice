package _03com.nag.CURD_Operations_Insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import _03com.nag.CURD_Operations_Insert.Student;

public class SaveClient {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_03com/nag/CURD_Operations_Insert/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		//Create student object
		
		Student st = new Student();
		st.setId(111);
		st.setName("ABC");
		st.setEmail("ABC@gmail.com");
		st.setMarks(400);
		
		int pk = (Integer)s.save(st);
		
		t.commit();
		s.close();
		sf.close();
		
		System.out.println(pk);
		System.out.println("data insertion success using save");
		
	}

}

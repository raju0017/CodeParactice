package _03com.nag.CURD_Operations_Update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import _03com.nag.CURD_Operations_Insert.Student;

public class MergeClaint {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_03com/nag/CURD_Operations_Insert/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		//Create student object
		
		Student st = new Student();
		st.setId(444);
		st.setName("CDE");
		st.setEmail("CDE@ymail.com");
		st.setMarks(500);
		
		s.merge(st);
		t.commit();
		s.close();
		sf.close();
		
		
		System.out.println("data saved or updated based on primary key in object success");
		
	}

}

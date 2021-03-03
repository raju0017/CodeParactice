package _03com.nag.CURD_Operations_Update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveOrUpdateClient {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_03com/nag/CURD_Operations_Update/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		//Create student object
		
		Student st = new Student();
		st.setId(111);
		st.setName("king");
		st.setEmail("king@gmail.com");
		st.setMarks(400);
		
		s.saveOrUpdate(st);
		
		t.commit();
		s.close();
		sf.close();
		
		System.out.println("data saved or updated based on primary key in object success");
		
	}

}

// Notes saveOrUpdate method will update if the data is available and difference of passing data
// it will save the date if date is not available with primary key in table

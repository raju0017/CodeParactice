package _02com.nag.hbm2ddlDotAuto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create_Test {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("_02com/nag/hbm2ddlDotAuto/create_hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction trx = s.beginTransaction();
		
		Student st = new Student();
		st.setId(001);
		st.setName("Nagaraju");
		st.setEmail("nagaraju.mgv@gmail.com");
		st.setMarks(482);
		
		
		Course c = new Course();
		c.setCid(01);
		c.setCname("Java");
		c.setFee(20000.0f);
	
		s.save(st);
		s.save(c);
		
		trx.commit();
		
		s.close();
		sf.close();
		
		System.out.println("tables created successfully");

	}

}

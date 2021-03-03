package _02com.nag.hbm2ddlDotAuto;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import _02com.nag.hbm2ddlDotAuto.Student;

public class Upadte_Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_02com/nag/hbm2ddlDotAuto/update_hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Student st = new Student();
		
		st.setId(001);
		st.setEmail("king@gmail.com");
		
		Course c = new Course();
		c.setCid(02);
		c.setCname("Java");
		c.setFee(30000.00f);
		c.setLocation("Murugesh palya");
		
		s.save(c);
		
		s.update(st);
		
		tr.commit();
		
		System.out.println("table updated successfully");
		
		// Hibernate query while running
		
	/*
    		update
        		system.student1 
    		set
        		SName=?,
        		SEmail=?,
        		SMarks=? 
    		where
        		Sid=?
	 */
	}

}

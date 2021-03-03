package com.nag.HQL_CURD_Operations_05.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OldStudent_save_Client {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("insert/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		OldStudent os1 = new OldStudent(111, "ravi", 500);
		OldStudent os2 = new OldStudent(222, "raju", 600);
		OldStudent os3 = new OldStudent(333, "ranga", 700);
		
		s.save(os1);
		s.save(os2);
		s.save(os3);
		
		t.commit();
		s.close();
		sf.close();
		System.out.println("Table Inserted Successfully");

		
	}

}

package com.nag.HQL_CURD_Operations_05.select;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class NewStudent_select_Client {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("select/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		NewStudent ns1 = new NewStudent(111, "ravi", 500);
		NewStudent ns2 = new NewStudent(222, "raju", 600);
		NewStudent ns3 = new NewStudent(333, "ranga", 700);
		
		s.save(ns1);
		s.save(ns2);
		s.save(ns3);
		System.out.println("Table Inserted Successfully");

		String hql = "from NewStudent";
		Query q = s.createQuery(hql);
		
		List<NewStudent> list = q.list();
		for(NewStudent ns : list)
		{
			System.out.println("id: "+ns.getId()+" name: "+ns.getName()+" marks: "+ns.getMarks());
		}
		
		t.commit();
		s.close();
		sf.close();
	}

}

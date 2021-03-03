package com.nag.HQL_CURD_Operations_05.insert;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQL_Data_dump_table_Table_Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("insert/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		String hql = "insert into NewStudent(id,name,marks) select id,name,marks from OldStudent where id =:id ";

		Query q = s.createQuery(hql);
		q.setParameter("id", 111);
		int i = q.executeUpdate();
		System.out.println("number of rows dump from old to new table="+i);
		
		s.close();
		sf.close();
	}
 
}

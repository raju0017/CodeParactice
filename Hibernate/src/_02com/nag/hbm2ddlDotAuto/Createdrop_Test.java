package _02com.nag.hbm2ddlDotAuto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import _02com.nag.hbm2ddlDotAuto.Student;

public class Createdrop_Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_02com/nag/hbm2ddlDotAuto/create-drop_hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction trx = s.beginTransaction();
		
		trx.commit();
		s.close();
		sf.close();
		System.out.println("tables created-droped successfully");

	}

}

package _01com.nag.basicConnections;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class MysqlConnection_Test {

	public static void main(String[] args) {

		/*// from Hibernate 4.3.0 onwards the SessionFactory creation
		Configuration configuration = new Configuration().configure("resources/hibernate.cfg.xml");
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
		applySettings(configuration.getProperties());
		SessionFactory sf = configuration.buildSessionFactory(builder.build());*/
		
		Configuration cfg = new Configuration();
		cfg.configure("_01com/nag/basicConnections/mySQL_hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Student st1 = new Student();
		st1.setSid(333);
		st1.setSname("king");
		st1.setSemail("king@gmail.com");
		st1.setSmarks(500);
		
		s.saveOrUpdate(st1);

		t.commit();
		s.close();
		sf.close();
		System.out.println("saved successfully");
	}

}


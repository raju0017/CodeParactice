package _04com.nag.Primary_Key_Auto_Genertors_Assigned;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Assigend_Driver {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_04com/nag/Primary_Key_Auto_Genertors_Assigned/assigned.hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		//Student st = new Student(10, "AAA", "AAA@gmail.com", 500);
		//int pk = (Integer) s.save(st);
		
		Student stu = new Student();
		stu.setName("king");
		stu.setEmail("king@gmail.cim");
		stu.setMarks(482);

		int pk = (Integer) s.save(stu);// it wont work b/c for Assigned the programmer has to pass primary key
									// so we will get below exception
									// ids for this class must be manually assigned before calling save()
		
		System.out.println("Returned value == "+pk);
		t.commit();

		s.close();
		sf.close();
		
		System.out.println("tables created successfully using Assigned generator");

	}

}

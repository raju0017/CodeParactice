package _04com.nag.Primary_Key_Auto_Genertors_CustomSequence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustonSeq_Driver {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_04com/nag/Primary_Key_Auto_Genertors_CustomSequence/customSequence.hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		Student stu = new Student();
		stu.setName("ddd");
		stu.setEmail("dddg@gmail.cim");
		stu.setMarks(482);

		int pk = (Integer) s.save(stu);
		
		System.out.println("Returned value == "+pk);
		t.commit();

		s.close();
		sf.close();
		
		System.out.println("tables created successfully using Assigned generator");

	}

}

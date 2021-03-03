package _03com.nag.CURD_Operations_Update;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateClaint {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("_03com/nag/CURD_Operations_Update/update.hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
	
		
		Student st1 = new Student();
		st1.setId(444);
		st1.setName("Dinesh");
		//create session
		Session session1 = sf.openSession();
		session1.saveOrUpdate(st1);
		session1.close();
		//emp1 object in detached state now

		st1.setName("Dinesh Rajput");//Updated Name
		//Create session again
		Session session2 = sf.openSession();
		Student st2 =(Student)session2.get(Student.class, 444);
		//st2 object in persistent state with id 444

		//below we try to make on detached object with id 100 to persistent state by using update method of hibernate
		session2.update(st1);//It occurs the exception NonUniqueObjectException because st2 object is having employee with same empid as 100. In order //to avoid this exception we are using merge like given below instead of session.update(emp1);

		session2.merge(st1); //it merge the object state with st2
		session2.update(st1); //Now it will work with exception
		
	}

}

 package dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import model.Student;

public class StudentDaoImplHT implements StudentDao {
	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Override
	public int save(Student st) {
		int i = (Integer) ht.save(st);
		return i;
	}

	@Override
	public boolean update(Student st) {
		ht.update(st);
		return true;
	}

	@Override
	public boolean delete(Student st) {
		ht.delete(st);
		return true;
	}

	@Override
	public Student findByPk(int id) {
		Student std = (Student) ht.get(Student.class , id);
		return std;
	}

	@Override
	public List<Student> findByName(String name) {
		Object list = ht.get(Student.class, name);
		return (List<Student>) list;
	}

	@Override
	public Student findByEmail(String email) {
		Student list = (Student)ht.get(Student.class, email);
		return list;
	}

	@Override
	public List<Student> findByAddress(String address) {
		Object list = ht.get(Student.class, address);
		return (List<Student>) list;
	}
	
	@Override
	public List<Student> finAllUsingHQL() {
		
		List<Student> list = ht.find("from student");
		return list;
	}

	/*@Override
	public List<Student> finAllUsigCreteria() {
		DispachedCreteria dc = DispachedCreteria.forClass(Student.class);
		List<Student> list =ht.findByCriteria(dc);
		return list;
	}*/

}

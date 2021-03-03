package dao;

import java.util.List;


import model.Student;

public interface StudentDao {
	int save(Student st);

	boolean update(Student st);

	boolean delete(Student st);

	Student findByPk(int id);

	List<Student> findByName(String name);

	Student findByEmail(String email);

	List<Student> findByAddress(String address);

	List<Student> finAllUsingHQL();
	//st<Student> finAllUsigCreteria();
}

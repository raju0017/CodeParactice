package dao;

import java.util.List;

import model.Student;

public interface StudentDao {

	int save(Student st) throws Exception;

	boolean update(Student st) throws Exception;

	boolean delete(Student st) throws Exception;

	Student findById(int id) throws Exception;

	List<Student> findByName(String name) throws Exception;

	Student findByEmail(String email) throws Exception;

	List<Student> findByAddress(String address) throws Exception;

	List<Student> finAll() throws Exception;

}

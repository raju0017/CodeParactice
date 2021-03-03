package business;

import model.Student;

public interface StudentBo {
	
	int createStudent(Student st) throws Exception;
	boolean updateStudent(Student st) throws Exception;
	boolean deleteStudent(Student st) throws Exception;
}

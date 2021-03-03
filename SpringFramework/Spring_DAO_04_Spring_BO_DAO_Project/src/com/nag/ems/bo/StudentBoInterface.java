package com.nag.ems.bo;

import com.nag.ems.model.Student;

public interface StudentBoInterface {
	
	int createStudent(Student st);
	Student findStudent(int id);
}

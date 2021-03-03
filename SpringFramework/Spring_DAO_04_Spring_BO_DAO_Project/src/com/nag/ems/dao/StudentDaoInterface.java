package com.nag.ems.dao;

import com.nag.ems.model.Student;

public interface StudentDaoInterface {

	int save(Student st);

	Student find(int id);

}

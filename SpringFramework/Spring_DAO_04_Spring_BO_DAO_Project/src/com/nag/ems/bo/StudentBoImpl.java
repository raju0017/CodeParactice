package com.nag.ems.bo;

import com.nag.ems.dao.StudentDaoInterface;
import com.nag.ems.model.Student;

public class StudentBoImpl implements StudentBoInterface {
	
	private StudentDaoInterface sdao;
	
	public void setSdao(StudentDaoInterface sdao) {
		this.sdao = sdao;
	}
	
	public int createStudent(Student st) {
		return sdao.save(st);
	}

	public Student findStudent(int id) {
		
		return sdao.find(id);
	}
	

}

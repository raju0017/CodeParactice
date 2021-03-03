package com.nag.ems.dao;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.nag.ems.model.Student;

public class StudentDaoImpl implements StudentDaoInterface {
	
	private HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	public int save(Student st) {
		int i = (Integer) ht.save(st);
		return i;
	}
	public Student find(int id) {
		Student st = (Student)ht.get(Student.class, id);
		
		return st;
	}

}

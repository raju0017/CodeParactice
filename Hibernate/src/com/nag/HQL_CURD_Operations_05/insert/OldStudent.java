package com.nag.HQL_CURD_Operations_05.insert;

public class OldStudent {
	private int id;
	private String name;
	private int marks;

	public OldStudent() {
	}
	public OldStudent(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}

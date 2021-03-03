package interview.company.object_fortier_software;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 47L;

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

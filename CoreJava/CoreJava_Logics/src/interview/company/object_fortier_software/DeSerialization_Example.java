package interview.company.object_fortier_software;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization_Example {

	public static void main(String args[]) throws Exception {

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"));
		Student s = (Student) in.readObject();
		System.out.println(s.id + " " + s.name);

		in.close();
	}

}

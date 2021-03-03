package c_collection_primitive_Constructor_DI_;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Question {
	private String qname;
	private int id;
	private List<String> answers;

	public Question() {
	}

	public Question(String qname, int id, List<String> answers) {
		super();
		this.qname = qname;
		this.id = id;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + ". " + qname);
		System.out.println("answers are");

		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}

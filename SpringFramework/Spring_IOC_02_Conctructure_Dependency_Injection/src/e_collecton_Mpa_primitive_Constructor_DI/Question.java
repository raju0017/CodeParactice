package e_collecton_Mpa_primitive_Constructor_DI;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private String qname;
	private int id;
	private Map<String, String> answers;

	public Question() {
	}

	public Question(String qname, int id, Map<String, String> answers) {
		super();
		this.qname = qname;
		this.id = id;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + qname);
		System.out.println("answers are");

		Set<Entry<String, String>> set = answers.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();

			System.out.println(entry.getKey() + ". " + entry.getValue());
		}

	}
}

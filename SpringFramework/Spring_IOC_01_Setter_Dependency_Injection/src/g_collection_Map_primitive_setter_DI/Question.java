package g_collection_Map_primitive_setter_DI;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String qname;
	private Map<String, String> answers;

	public Question() {
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getQname() {
		return qname;
	}

	public final void setQname(String qname) {
		this.qname = qname;
	}

	public final Map<String, String> getAnswers() {
		return answers;
	}

	public final void setAnswers(Map<String, String> answers) {
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

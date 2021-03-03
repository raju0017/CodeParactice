package h_collection_Map_secondery_setter_DI_;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	private int id;
	private String qname;
	private Map<Answers, User> answers;

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

	public final Map<Answers, User> getAnswers() {
		return answers;
	}

	public final void setAnswers(Map<Answers, User> answers) {
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + qname);
		System.out.println("answers are");

		Set<Entry<Answers, User>> set = answers.entrySet();
		Iterator<Entry<Answers, User>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Answers, User> entry = itr.next();
			Answers ans = entry.getKey();
			User user = entry.getValue();
			System.out.println("Answer Information:");
			System.out.println(ans);
			System.out.println("Posted By:");
			System.out.println(user);
		}

	}
}

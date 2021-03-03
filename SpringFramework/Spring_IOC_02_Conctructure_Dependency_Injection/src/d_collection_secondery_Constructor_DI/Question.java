package d_collection_secondery_Constructor_DI;

import java.util.Iterator;
import java.util.List;

import d_collection_secondery_Constructor_DI.Answers;

public class Question {
	private int id;
	private String qname;
	private List<Answers> answers;

	public Question() {
	}

	public Question(int id, String qname, List<Answers> answers) {
		this.id = id;
		this.qname = qname;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + qname);
		System.out.println("answers are");

		Iterator<Answers> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    } 
	}
}

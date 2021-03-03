package f_collection_Map_secondery_Constructor_DI;

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

	public Question(int id, String qname, Map<Answers, User> answers) {
		this.id = id;
		this.qname = qname;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + qname);
		System.out.println("answers are");
		
		Set<Entry<Answers, User>> set=answers.entrySet();  
	    Iterator<Entry<Answers, User>> itr=set.iterator();  
	    while(itr.hasNext()){  
	        Entry<Answers, User> entry=itr.next();  
	        Answers ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user);  
	    }  

	}
}

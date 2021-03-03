package f_collection_Map_secondery_Constructor_DI;

import java.util.Date;

public class Answers {
	private int id;  
	private String answer;  
	private Date postedDate;  
	public Answers() {}  
	public Answers(int id, String answer, Date postedDate) {  
	    super();  
	    this.id = id;  
	    this.answer = answer;  
	    this.postedDate = postedDate;  
	}  
	  
	public String toString(){  
	    return "Id:"+id+" Answer:"+answer+" Posted Date:"+postedDate;  
	}  }
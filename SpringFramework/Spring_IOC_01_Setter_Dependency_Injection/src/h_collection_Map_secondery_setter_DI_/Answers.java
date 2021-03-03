package h_collection_Map_secondery_setter_DI_;

import java.util.Date;

public class Answers {
	private int id;
	private String answer;
	private Date postedDate;

	public Answers() {
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getAnswer() {
		return answer;
	}

	public final void setAnswer(String answer) {
		this.answer = answer;
	}

	public final Date getPostedDate() {
		return postedDate;
	}

	public final void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}

	public String toString() {
		return "Id:" + id + " Answer:" + answer + " Posted Date:" + postedDate;
	}
}
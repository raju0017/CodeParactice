package d_collection_secondery_Constructor_DI;

public class Answers {
	private int id;
	private String name, by;

	public Answers() {

	}

	public Answers(int id, String name, String by) {
		this.id = id;
		this.name = name;
		this.by = by;
	}

	public String toString() {
		return id + " " + name + " " + by;
	}
}
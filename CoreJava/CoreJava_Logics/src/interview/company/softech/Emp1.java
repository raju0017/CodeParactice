package interview.company.softech;

public class Emp1 implements Comparable<Object> {
	int id;
	String name;

	public Emp1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {

		Emp1 e = (Emp1) o;

		if (id == e.id) {
			return 0;
		} else if (id > e.id) {
			return 1;
		} else {
			return -1;
		}
	}

}

package interview.company.company_IBS;

public class Student {
	String _name;
	int _age;

	Student(String _name, int _age) {
		this._name = _name;

		this._age = _age;
	}

	public void modM1(Student st) {
		st._name = "ABC";
	}

	public void modM2(Student st) {

		st = new Student("Jhon", 20);

	}

	public String toString() {
		return "Student [ _name =" + _name + " _age =" + _age + "]";
	}

	public static void main(String[] args) {

		Student st = new Student("Xyz", 40);
		// System.out.println(st);

		st.modM1(st);
		System.out.println(st);
		st.modM2(st);
		System.out.println(st);

	}

}

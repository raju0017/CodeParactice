package basics.prgrams;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		List al = new LinkedList();
		al.add(new Student1(102, "Mohan", 22));
		al.add(new Student1(101, "Siva Reddy", 26));
		Collections.sort(al, new NameComparator());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollNo + " " + st.name + " " + st.age);

		}
		System.out.println("-----------------------------");
		Collections.sort(al, new RollComparator());
		Iterator itr1 = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr1.next();
			System.out.println(st.rollNo + " " + st.name + " " + st.age);

		}

	}

}

class Student1 {
	int roll;
	String name;
	int age;

	public Student1(int roll, String name, int age) {
		this.roll = roll;
		this.name = name;
		this.age = age;

	}
}

class NameComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Student1 s1 = (Student1) o1;
		Student1 s2 = (Student1) o2;

		return s1.name.compareTo(s2.name);
	}
}
	class RollComparator implements Comparator {
		public int compare(Object o1, Object o2) {
			Student1 s1 = (Student1) o1;
			Student1 s2 = (Student1) o2;
			if (s1.roll == s2.roll) {
				return 0;
				
			} else if (s1.roll > s2.roll) {
				return 1;
			} else {
				return -1;
			}
			
		}
	}

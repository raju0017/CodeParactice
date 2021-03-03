package interview.company.softech;

import java.util.Comparator;

public class Ename_Sorting_using_Comparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {

		return (e1.ename).compareTo(e2.ename);
	}
	

}

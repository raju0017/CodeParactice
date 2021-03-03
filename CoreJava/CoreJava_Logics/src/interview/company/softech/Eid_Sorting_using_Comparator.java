package interview.company.softech;

import java.util.Comparator;

public class Eid_Sorting_using_Comparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {

		if (e1.eid == e2.eid) {
			return 0;
		}
		else if(e1.eid>e2.eid) {
			return 1;
		}
		else {
			return -1;
		}
	}

}

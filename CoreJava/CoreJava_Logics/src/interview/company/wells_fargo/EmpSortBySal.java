package interview.company.wells_fargo;

import java.util.Comparator;

public class EmpSortBySal implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if(e1.getSal() > e2.getSal())
		{
			return 1;
		}
		if(e1.getSal() < e2.getSal())
		{
			return -1;
		}
		return 0;
	}
	
}

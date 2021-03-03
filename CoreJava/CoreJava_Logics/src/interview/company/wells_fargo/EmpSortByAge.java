package interview.company.wells_fargo;

import java.util.Comparator;

public class EmpSortByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

		if(e1.getAge() > e2.getAge())
		{
			return 1;
		}
		if(e1.getAge() < e2.getAge())
		{
			return -1;
		}
		return 0;
	}
	
}

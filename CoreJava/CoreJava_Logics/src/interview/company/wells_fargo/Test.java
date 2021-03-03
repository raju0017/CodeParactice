package interview.company.wells_fargo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static List<Employee> empList(List<Employee> list)
	{
		Collections.sort(list, new EmpSortByName());
		Collections.sort(list, new EmpSortBySal());
		Collections.sort(list, new EmpSortByAge());
		return list;
		
	}
public static void main(String[] args) {
	
	List<Employee> list = new ArrayList<Employee>();
	Employee e = new Employee("nagaraju", 25, 50000);
	Employee e1 = new Employee("siva", 26, 60000);
	Employee e2 = new Employee("manoj", 24, 70000);
	Employee e3 = new Employee("vamshi", 25, 80000);
	list.add(e);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	
	System.out.println(Test.empList(list));
	
}
}

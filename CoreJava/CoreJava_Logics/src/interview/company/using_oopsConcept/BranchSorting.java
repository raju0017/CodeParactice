package interview.company.using_oopsConcept;

import java.util.Comparator;

public class BranchSorting implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {

		
		return (st1.branch).compareTo(st2.branch);
	}
	

}

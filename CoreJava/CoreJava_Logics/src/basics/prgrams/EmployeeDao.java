package basics.prgrams;


public class EmployeeDao {

	public static EmployeeDao employeeDao = new EmployeeDao();
	
	/*private EmployeeDao(){
		
	}
	*/
	public static EmployeeDao getEmpDao(){
		return employeeDao;
	}
	
	public String getEmpName(String empId) {
		String name="";
		if(empId.equals("A11")) {
			name = "Employee A";
		} else {
			name = "Employee other";
		}
		
		return name;
	}
}

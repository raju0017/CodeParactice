package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDao {
	
	 void saveEmployee(Employee e);
	 void updateEmployee(Employee e);
	 void deleteEmployee(Employee e);
	 Employee getById(int id);
	 List<Employee> getEmployees();
}

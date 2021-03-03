package dao;


import model.Employee;

public interface EmployeeDao {
	int save(Employee e) ;
	int update(Employee e) ;
	int delete (Employee e) ;

}

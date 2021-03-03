package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	HibernateTemplate ht;
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	public HibernateTemplate getHt() {
		return ht;
	}
	
	//method to save employee  
	public void saveEmployee(Employee e){  
	    ht.save(e);  
	}  
	//method to update employee  
	public void updateEmployee(Employee e){  
	    ht.update(e);  
	}  
	//method to delete employee  
	public void deleteEmployee(Employee e){  
	    ht.delete(e);  
	}  
	//method to return one employee of given id  
	public Employee getById(int id){  
	    Employee e=(Employee)ht.get(Employee.class,id);  
	    return e;  
	}  
	//method to return all employees  
	public List<Employee> getEmployees(){  
	    List<Employee> list=new ArrayList<Employee>();  
	    list=ht.loadAll(Employee.class);  
	    return list;  
	}  

}

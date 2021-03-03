package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import model.Employee;

public class claint {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("resources/spring.xml");  
	      
	    EmployeeDao edaoipml =(EmployeeDao)ctx.getBean("edaoimpl"); 
	    
	    /*int status=edaoipml.save(new Employee(100,"king", 50000 ));
	    System.out.println(status); */ 
	    
	   /* int status=edaoipml.update(new Employee(100,"raju", 50000 ));
	    System.out.println(status); */
	          
	    Employee e=new Employee(); 
	    e.setId(100); 
	    e.setName("king");
	    e.setSal(30000);
	    
	    int status1 = edaoipml.save(e);
	    
	   // int status=edaoipml.delete(e);
	    
	    
	    System.out.println(status1);  

	}

}

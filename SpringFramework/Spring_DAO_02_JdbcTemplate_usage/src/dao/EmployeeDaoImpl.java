package dao;

import java.sql.Connection;

import org.springframework.jdbc.core.JdbcTemplate;

import model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jt;
	

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	Connection con;
	@Override
	public int save(Employee e) {
		String query="insert into employee4 values('"+e.getId()+"','"+e.getName()+"','"+e.getSal()+"')";
		return jt.update(query);
	}

	@Override
	public int update(Employee e)  {
		String query="update employee4 set name='"+e.getName()+"',sal='"+e.getSal()+"' where id='"+e.getId()+"'";  
			    return jt.update(query);
	}

	@Override
	public int delete(Employee e)  {
		String query="delete from employee4 where id='"+e.getId()+"' ";  
	    return jt.update(query);
		
	}
	

}

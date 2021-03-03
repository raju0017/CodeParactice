package com.king.service;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.king.utils.ConnectionFactory;

@Path("/employeeService")
public class EmployeeService {

	@GET
	@Path("/getEmployeeById")
	@Produces("application/json")
	public Employee getWeatherByCityId(@QueryParam("eid") int eid) {

		Connection con = ConnectionFactory.getConnection();
		Employee emp = null;
		try {

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE WHERE EID='" + eid + "'");

			if (rs.next()) {
				emp = new Employee();
				emp.setEid(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return emp;
	}

	@POST
	@Path("/createEmployee")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createEmployee(Employee emp) {
		int id = emp.getEid();
		String name = emp.getName();
		int salary = emp.getSalary();

		Response response = null;

		Connection con = ConnectionFactory.getConnection();

		try {
			PreparedStatement statement = con.prepareStatement("insert into EMPLOYEE values(?,?,?)");

			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setInt(3, salary);

			int noOfRecordsUpdated = statement.executeUpdate();

			if (noOfRecordsUpdated > 0) {
				response = Response.status(200).entity("Employee inserted successfully...").build();
			} else {
				response = Response.status(201).entity("Employee inserted failed...").build();
			}
		} catch (Exception e) {
			response = Response.status(202).entity("Employee inserted failed...").build();
			e.printStackTrace();
		}
		return response;

	}

	@GET
	@Path("/deleteEmployeeById")
	public Response deleteEmployeeById(@QueryParam("eid") int eid) {

		Response response = null;

		Connection con = ConnectionFactory.getConnection();

		try {
			PreparedStatement statement = con.prepareStatement("delete EMPLOYEE where eid=?");

			statement.setInt(1, eid);

			int noOfRecordsUpdated = statement.executeUpdate();

			if (noOfRecordsUpdated > 0) {
				response = Response.status(200).entity("Employee deleted successfully...").build();
			} else {
				response = Response.status(201).entity("Employee deleted failed...").build();
			}
		} catch (Exception e) {
			response = Response.status(202).entity("Employee deleted failed...").build();
			e.printStackTrace();
		}
		return response;
	}

	@DELETE
	@Path("/deleteEmployee")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deleteEmployee(Employee emp) {

		Response response = null;

		int eid = emp.getEid();

		Connection con = ConnectionFactory.getConnection();

		try {
			PreparedStatement statement = con.prepareStatement("delete EMPLOYEE where eid=?");

			statement.setInt(1, eid);

			int noOfRecordsUpdated = statement.executeUpdate();

			if (noOfRecordsUpdated > 0) {
				response = Response.status(200).entity("Employee deleted successfully...").build();
			} else {
				response = Response.status(201).entity("Employee deleted failed...").build();
			}
		} catch (Exception e) {
			response = Response.status(202).entity("Employee deleted failed...").build();
			e.printStackTrace();
		}
		return response;

	}

	@GET
	@Path("/updateEmployeeSalaryById")
	public Response updateEmployeeSalaryById(int eid, int salary) {
		Response response = null;

		Connection con = ConnectionFactory.getConnection();

		try {
			PreparedStatement statement = con.prepareStatement("update EMPLOYEE set salary=? where eid=?");

			statement.setInt(1, salary);
			statement.setInt(2, eid);

			int noOfRecordsUpdated = statement.executeUpdate();

			if (noOfRecordsUpdated > 0) {
				response = Response.status(200).entity("Employee updated successfully...").build();
			} else {
				response = Response.status(201).entity("Employee updated failed...").build();
			}
		} catch (Exception e) {
			response = Response.status(202).entity("Employee updated failed...").build();
			e.printStackTrace();
		}
		return response;
	}

	@PUT
	@Path("/updateEmployeeSalary")
	@Consumes("application/json")
	public Response updateEmployeeSalary(Employee emp) {
		Response response = null;
		int eid = emp.getEid();
		int salary = emp.getSalary();

		Connection con = ConnectionFactory.getConnection();

		try {
			PreparedStatement statement = con.prepareStatement("update EMPLOYEE set salary=? where eid=?");

			statement.setInt(1, salary);
			statement.setInt(2, eid);

			int noOfRecordsUpdated = statement.executeUpdate();

			if (noOfRecordsUpdated > 0) {
				response = Response.status(200).entity("Employee updated successfully...").build();
			} else {
				response = Response.status(201).entity("Employee updated failed...").build();
			}
		} catch (Exception e) {
			response = Response.status(202).entity("Employee updated failed...").build();
			e.printStackTrace();
		}
		return response;
	}

}

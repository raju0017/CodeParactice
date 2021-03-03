package com.nag.ems.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nag.ems.bo.StudentBoImpl;
import com.nag.ems.bo.StudentBoInterface;
import com.nag.ems.model.Student;

/**
 * Servlet implementation class EmpSaveController
 */
public class StudentSaveController extends HttpServlet {
	ConfigurableApplicationContext cap;
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {

		cap = new ClassPathXmlApplicationContext("resources/spring.xml");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		// send data to business
		StudentBoInterface bo = (StudentBoImpl)cap.getBean("stboimpl");
		
		Student st = new Student();
		st.setId(id);
		st.setName(name);
		st.setEmail(email);
		st.setAddress(address);
		
		int i = bo.createStudent(st);
		if(i!=0){
			response.getWriter().print("Success");
		}
		else
		{
			response.getWriter().print("Fail");
		}
		
	}
	@Override
	public void destroy() {
		cap.close();
	}

}

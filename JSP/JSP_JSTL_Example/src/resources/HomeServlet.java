package resources;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.EmployeeBean;

public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<EmployeeBean> empList = new ArrayList<EmployeeBean>();
		EmployeeBean emp1 = new EmployeeBean();
		emp1.setId(1);
		emp1.setName("Pankaj");
		emp1.setRole("Developer");
		EmployeeBean emp2 = new EmployeeBean();
		emp2.setId(2);
		emp2.setName("nagaraj");
		emp2.setRole("Manager");

		empList.add(emp1);
		empList.add(emp2);
		request.setAttribute("empList", empList);

		request.setAttribute("htmlTagData", "<br/> creates a new line.");
		request.setAttribute("url", "http://www.journaldev.com");
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
		rd.forward(request, response);
	}

}

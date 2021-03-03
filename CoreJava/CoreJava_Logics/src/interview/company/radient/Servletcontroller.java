package interview.company.radient;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servletcontroller
 */
@WebServlet("/Servletcontroller")
public class Servletcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servletcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		long salary = Long.parseLong(request.getParameter("salary"));
		
		Employee e = new Employee();
		
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		
		List<Employee> list = new ArrayList<>();
		
		list.add(e);
				
		request.setAttribute("empList", list);
		
		
		String insertButton = request.getParameter("addButton");
		String viewButton = request.getParameter("viewButton");
		

		request.setAttribute("insert", insertButton);
		if(insertButton != null){
			RequestDispatcher rd = request.getRequestDispatcher("insert.jsp");
			rd.forward(request, response);
		}
		
		if(viewButton != null){
			RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
		}
		
	}

}

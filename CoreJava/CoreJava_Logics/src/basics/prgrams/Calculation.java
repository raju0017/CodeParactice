/*package basics.prgrams;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("texthtml");
		PrintWriter out = response.getWriter();
		
		String amount = request.getParameter("amount");
		char[] amount1 =amount.toCharArray();
		int amount2 =Integer.parseInt(amount);
		
		int count1=0;
		for(int i = 0; i<=amount1.length; i++)
		{
			count1++;
			if(amount.indexOf(i)==1)
				break;
		}
		out.print(count1);
		
		switch (count1) {
		case 1:
			out.println((amount2/100)*2);
			break;
		case 2:
			out.println((amount2/100)*5);
			break;
		case 3:
			out.println((amount2/100)*10);
			break;
		case 4:
			out.println((amount2/100)*15);
			break;
		case 5:
			out.println((amount2/100)*20);
			break;
		default:
			out.println("no discount");
			break;
		}
		
	}

}
*/
import java.io.*;
import java.time.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class Age extends HttpServlet{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	
    	LocalDate dob = LocalDate.parse(request.getParameter("dob"));
    	LocalDate curDate = LocalDate.now();
    	Period period = Period.between(dob, curDate);
    	out.println("<h1>"+"Your age is"+"</h1>");
    	out.println("<h1>"+period.getYears()+" Years"+"</h1>");
    	out.println("<h1>"+period.getMonths()+" Months"+"</h1>");
    	out.println("<h1>"+period.getDays()+" Days"+"</h1>");
    }
}
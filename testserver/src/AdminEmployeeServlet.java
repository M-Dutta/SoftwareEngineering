
import java.io.IOException; 
import java.text.ParseException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminEmployeeServlet extends HttpServlet {
 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
@Override
public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException {
	
	response.setContentType("text/html; charset=UTF-8");
	
	if (request.getParameter("edit") != null)
	{
		response.sendRedirect("editEmployeeDetails.html");	
	}
	if (request.getParameter("remove") != null)
	{	
	}
	if (request.getParameter("add") != null)
	{
		response.sendRedirect("addEmployee.html");	
	}
	if (request.getParameter("options") != null)
	{
		response.sendRedirect("adminOptions.html");	
	}
	
}
}



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/TestInitParmServlet")
public class TestInitParmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public TestInitParmServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String initParam = getInitParameter("company");
		ServletContext context = getServletContext();
		String contextParam = context.getInitParameter("city");
		
		PrintWriter out = response.getWriter();
		
		out.println("comopany : " + initParam);
		out.println("city : " + contextParam);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

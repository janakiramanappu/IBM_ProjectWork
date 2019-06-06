import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CompareServlet")
public class CompareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CompareServlet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String u = request.getParameter("user");
		String p = request.getParameter("pass");
		
		String user1="appu";
		String pass1="appu";
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if(user1.equals(u) && (pass1.equals(p))) {
			
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Compare Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Welcome " + u + " </h1>");
		out.println("</body>");
		out.println("</html>");
		}
		
		else {
			
		
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Compare Servlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Wrong values</h1>");
			out.println("</body>");
			out.println("</html>");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Calculator() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String i = request.getParameter("value1");
		String j = request.getParameter("value2");
		String opr = request.getParameter("opr");
		int r;
		
		response.setContentType("text/html");
		
		if(opr.equals("add")) {
			r=Integer.parseInt(i)+Integer.parseInt(j);
		}
		
		else if(opr.equals("sub")) {
			r=Integer.parseInt(i)-Integer.parseInt(j);
		}
		
		else if(opr.equals("mul")) {
			r=Integer.parseInt(i)*Integer.parseInt(j);
		}
		
		else {
			r=Integer.parseInt(i)/Integer.parseInt(j);
		}
		
		/*double v1=Double.parseDouble(i);
		double v2=Double.parseDouble(j);
		double r=0.0;
		
		switch(opr) {
		case "add":
			r=v1+v2;
			break;
			
		case "sub":
			r=v1-v2;
			break;
			
		case "mul":
			r=v1*v2;
			break;
			
		case "div":
			r=v1/v2;
			break;	
		}*/
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Result</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Result : " + r + " </h1>");
		out.println("</body>");
		out.println("</html>");
	
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

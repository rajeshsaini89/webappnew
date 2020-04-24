


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet{
	

	@WebServlet("/hello")
	private static final long serialVersionUID = 1L;
	   @Override
	   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
	         throws ServletException, IOException {
	      resp.setContentType("text/plain");
	      resp.getWriter().write("Hell World! Maven Web Project Example.");
	   }

}

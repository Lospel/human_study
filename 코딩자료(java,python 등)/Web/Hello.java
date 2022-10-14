import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {
	public void service (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("HELLO HUMAN 1");

		PrintWriter out = response.getWriter();
		out.println("Hellow WEB~~");
	}

}
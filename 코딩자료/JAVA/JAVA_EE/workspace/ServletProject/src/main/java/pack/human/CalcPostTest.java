package pack.human;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calc-Post")
public class CalcPostTest extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String strX = request.getParameter("x");
		String strY = request.getParameter("y");

		int intX = Integer.parseInt(strX);
		int intY = Integer.parseInt(strY);

		int result = intX + intY;

		PrintWriter out = response.getWriter();
		out.println("두수의 합은 = " + result);

	}

}

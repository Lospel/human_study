package pack.status;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CalcSession")
public class CalcSession extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		HttpSession sess  = request.getSession();
//		Session 영역을 만듦. 즉, 세션별 사용자 영역 다름.
		int result = 0;
		String strValue = request.getParameter("value");
		String operator = request.getParameter("operator");

		if (operator.equals("+") || operator.equals("-")) {
			sess.setAttribute("x", strValue);
			sess.setAttribute("oper", operator);
		} else if (operator.equals("=")) {
			int intValue = Integer.parseInt(strValue);
			String strX = (String) sess.getAttribute("x");
			System.out.println("strX : " + strX);
			System.out.println("oper : " + sess.getAttribute("oper"));
			

			if (sess.getAttribute("oper").equals("+")) {
				result = Integer.parseInt(strX) + intValue;
			} else if (sess.getAttribute(operator).equals("-")) {
				result = Integer.parseInt(strX) - intValue;
			}
			PrintWriter out = response.getWriter();
			out.printf("result = %d \n", result);
		}

	}
}

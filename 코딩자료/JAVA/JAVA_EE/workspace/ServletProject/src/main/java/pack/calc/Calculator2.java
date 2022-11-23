package pack.calc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator2")
public class Calculator2 extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		String[] strValues = request.getParameterValues("values");
//		getParameter는 단수의 값. (즉, 변수에 값이 1개일떄)
//		getParameterValues는 복수의 값. (즉, 변수에 값이 2개 이상일때)
		int intX = Integer.parseInt(strValues[0]);
		int intY = Integer.parseInt(strValues[1]);
		
		int result = 0;
		String strOper = request.getParameter("operator");
//		request.getParameter를 통해서 얻는 것은 해당 Tag의 value 값임.
		System.out.println("strOper = " + strOper);

		if (strOper.equals("더하기")) {
			result = intX + intY;
		} else {
			result = intX - intY;
		}
		PrintWriter out = response.getWriter();
		out.printf("결과는 %d입니다.", result);

	}
}

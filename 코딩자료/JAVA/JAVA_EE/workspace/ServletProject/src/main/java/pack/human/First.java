package pack.human;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class First extends HttpServlet {
//	HttpServlet은 추상클래스.
//	위의 추상클래스를 상속받은 First라는 JAVA파일은, service라는 메서드를 오버라이드 필요함

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		System.out.println("console hello Human1");
//		console 창에 출력하는 것을 의미함

		PrintWriter out = response.getWriter();
		out.println("Browser hello Human1");
//		PrintWriter 는 Browser에 출력하는 것을 의미함.
	}
}

// first.java 파일이 컴파일되어 first.class 파일이 생성되고, 톰캣과 연동하는 것은 자동으로 처리됨.
// run as > run on Server를 실행할 경우 위의 내용이 자동으로 처리됨.
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWeb extends HttpServlet {
	public void service (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		System.out.println("HELLO HUMAN 2");

		PrintWriter out = response.getWriter();
		out.println("Hellow WEB2~~");
	}

}

// 메모장에서 Servlet을 실행시킬 경우
/*
1. HelloWeb이란 파일을 만들어서 컴파일 한다.
javac -cp 톰캣의lib폴더>servlet-api.jar HelloWeb.java 
위와 같이 하면. HelloWeb.class 파일이 생성됨.

2. HelloWeb.class파일을 톰캣의 webapps\ROOT\WEB-INF 폴더안에 classes 폴더를 만들어.
   위의 위치에 둔다.
   
3. 톰캣의 WEB-INF 폴더안에 web.xml 파일에 URL패턴과 class 파일의 Mapping을 한다.

4. 톰캣의 bin 폴더안의 startup.bat 클릭하여 톰캣을 실행시킨다.

5. chrome에서 localhost:8080/url패턴 입력

*/

// J2EE Eclipse를 활용하면서
/*
1. 자동으로 컴파일 된다.
2. 자동으로 처리된다.
3. 위와 동일하게 처리할 수도 있으나, ==> annotation(@WebServlet)을 활용하면 web.xml도 건드릴 필요없다.
(단, matadata-complete="true" ==> "false" 변경필요)
4. java on server를 실행하면 자동으로 실행된다.
5. 크롬에서 url 주소를 입력하면 실행됨. 
(url 주소는 @WebServlet에서 정의된 주소이다.)
*/
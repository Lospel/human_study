package exam20;

import java.text.MessageFormat;

public class MessageFormatExam {

	public static void main(String[] args) {
		String id = "java";
		String name = "강현준";
		String tel = "010-123-1234";

		String text = "회원ID : {0} \n회원 이름 : {1} \n회원전화 : {2} \n";
		String result1 = MessageFormat.format(text, id, name, tel);

		System.out.println(result1);
		// 출력할 때 \n에 의해 줄바꿈 일어남.
		System.out.println();

		String sql = "insert into member values( {0}, {1}, {2} )";
		Object[] arguments = { "'java'", "'강현준'", "'010-123-1234'" };
		// arguments[0] = 'java'
		// arguments[1] = '강현준'
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
		System.out.println();
	}

}

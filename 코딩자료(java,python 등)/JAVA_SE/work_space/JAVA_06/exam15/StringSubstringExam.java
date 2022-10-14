package exam15;

public class StringSubstringExam {

	public static void main(String[] args) {
		String ssn = "760000-100000";
		
		String firstNum = ssn.substring(0,6);
		// 0~6까지 문자열 잘라냄.
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		// 7~끝까지 문자열 잘라냄.
		System.out.println(secondNum);
		
	}

}

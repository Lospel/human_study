package exam15;

public class StringLengthExam {

	public static void main(String[] args) {
		String ssn = "7600001000000";
		int length = ssn.length();
		if (length == 13) {
			System.out.println("주민번호 자릿수 맞음");
		}
		else {
			System.out.println("주민번호 자릿수 틀림");
		}
	}

}

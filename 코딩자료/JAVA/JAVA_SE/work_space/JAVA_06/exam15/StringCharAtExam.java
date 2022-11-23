package exam15;

public class StringCharAtExam {

	public static void main(String[] args) {
		String ssn = "760000-1000000";
		char sex = ssn.charAt(7);
		// 7번째 문자를 가져옴
		switch(sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}

}

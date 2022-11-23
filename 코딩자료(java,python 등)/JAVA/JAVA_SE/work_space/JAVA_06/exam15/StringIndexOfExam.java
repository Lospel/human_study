package exam15;

public class StringIndexOfExam {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		// 같은 문자열이 있는 위치를 반환하여 location에 대입한다.
		System.out.println(location);
		
		System.out.println(subject.indexOf("자바"));
		System.out.println(subject.indexOf("자바를"));

		
		if(subject.indexOf("자바") != -1) {
			// subject.indexOf("자바") ==> 0 출력 / subject.indexOf("자바를") ==> -1
			System.out.println("자바관련 책");
		}
		else {
			System.out.println("자바 미관련 책");
		}
	}

}

package exam15;

public class StringSplitExam {

	public static void main(String[] args) {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-");
		// | 는 or의 개념 ==> 즉 & , - 기준으로 문자열을 잘라냄.
		// names[0] = 홍길동 .... names[4]=최명호
		
		for (String name : names) {
			System.out.println(name);
		}
	}

}

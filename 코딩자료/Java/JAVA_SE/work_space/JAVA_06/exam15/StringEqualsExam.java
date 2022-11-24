package exam15;

public class StringEqualsExam {

	public static void main(String[] args) {
		String strVar1 = new String("강현준");
		String strVar2 = "강현준";

		if (strVar1 == strVar2) {
			System.out.println("같은 객체");
		} 
		else {
			System.out.println("다른 객체");
		}
		if (strVar1.equals(strVar2)) {
			// equals는 Object 클래스의 객체 ==> 주소값을 비교.
			// String에서 오버라이드한 equals는 ==> 파라미터(인자 or 멤버변수)의 값을 비교한다.
			System.out.println("같은 객체");
		} 
		else {
			System.out.println("다른 객체");
		}

	}

}

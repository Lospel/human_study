package exam01_1;

public class EqualExam extends Object {	// extends Object 생략가능

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println (a==b);
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println (obj1 + "-" + obj2);
		// obj1 / obj2는 hashCode 기반으로 한 데이터를 가지고 있음.
		// hashCode는 객체를 식별할 하나의 정수값.
		System.out.println (obj1==obj2);
		
		String str1 = new String("강현준");
		String str2 = new String("강현준");
//		System.out.println (str1 + "-" + str2);
		System.out.println (str1==str2);			// false (주소값은 다름)
		System.out.println (str1.equals(str2));		// true  (내부의 값이 같음)
		// String이란 클래스 안에 equals가 오버라이딩 되어 있다.
	}

}

package exam08;

public class Test {
	public void test(String strA, String strB) throws NumberFormatException {
		// throws NumberFormatException은 호출한 부분으로 예외를 던진다.
		int strInt = Integer.parseInt(strB);
		// strB는 String인데 숫자로 변환이 가능하면 예외 미발생.
		// 숫자로 변환이 불가능하면 예외 발생.
		System.out.println(strInt);
	}
}

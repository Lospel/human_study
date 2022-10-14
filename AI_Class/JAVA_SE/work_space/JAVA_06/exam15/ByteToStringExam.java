package exam15;

public class ByteToStringExam {

	public static void main(String[] args) { // ASCII 코드
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4); // 엑셀함수 MID(bytes, 6 ,4)
		System.out.println(str2);

	}

}

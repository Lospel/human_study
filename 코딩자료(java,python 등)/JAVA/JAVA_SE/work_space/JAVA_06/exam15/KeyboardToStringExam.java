package exam15;

import java.io.IOException;

public class KeyboardToStringExam {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		// byte배열값보다 더 많은 값을 입력할 경우 System.in.read는 배열값까지만 입력받는다.
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		// 키보드에서 입력한 글자를 bytes의 배열변수에 담는 기능을 수행.
		// 엔터를 치면, 글자수를 반환합니다.
		System.out.println("readByteNo : " + readByteNo);
		// 엔터를 치는 순간, 캐리지리턴(\r) + 라인피드(\n) 자동으로 붙음. 그래서 글자수보다 2개 더 많다.
		// 한글은 3byte임.(UTF-8 코드 기반. 다른 코드기반에서는 2byte 처리?)

		String str = new String (bytes,0,readByteNo-2);
		System.out.println(str);
	}

}

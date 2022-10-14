package exam15;

import java.util.StringTokenizer;

public class StringTokenizerExam {

	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";
// 1번 방법
		StringTokenizer st = new StringTokenizer(text, "/");
		// '/' 기준으로 문자열을 잘라냄.
		int countTokens = st.countTokens(); // countTokens = 3
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			// 홍길동/이수홍/박연수 중 가장 앞쪽에 위치하면서 시작.
			System.out.println(token);
		}

		System.out.println();
// 2번 방법
		st = new StringTokenizer(text, "/");
		// st는 nextToken에 의해 이동이 되기 때문에 st를 새로이 만들어야 아래의 내용이 출력됨.
		
		while (st.hasMoreTokens()) { // hasMoreTokens은 다음에 Token이 있는지 확인.
			String token = st.nextToken();
			System.out.println(token);
		}

	}

}

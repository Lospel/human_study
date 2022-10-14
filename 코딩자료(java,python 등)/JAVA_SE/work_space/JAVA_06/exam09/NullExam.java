package exam09;

import java.util.Objects;

public class NullExam {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);
			// requireNonNull 이 메서드에서 Null을 파악해서 Exception을 발생시킨다..
			System.out.println(name);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
			System.out.println(name);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		

	}

}

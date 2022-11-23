package Exam_18.packA;

public class B {
	public static void main(String[] args) {
		A a1 = new A(true);
		// public은 동일 pkg이므로 가능.
//		A a2 = new A(10);
		// private은 동일 pkg라도 생성자 접근 불가.
		// private은 동일 클래스에서만 접근 가능.
		A a3 = new A(1.1, 5);
		// default인 경우는 동일 pkg에서 접근 가능.
	}
}

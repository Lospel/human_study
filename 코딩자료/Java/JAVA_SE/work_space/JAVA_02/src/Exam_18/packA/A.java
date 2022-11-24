package Exam_18.packA;

public class A {
	// 다른 pkg에서 접근가능하도록 public으로 클래스 선언.
	public A(boolean b) {
		System.out.println("a1 생성");
	}

	private A(int i) {
		System.out.println("a2 생성");
	}

	A(double d, int i) { // default
		System.out.println("a3 생성");
	}

	public static void main(String[] args) {
		A a1 = new A(true);
		A a2 = new A(10);
		A a3 = new A(1.1, 5);
		// 자신의 클래스는 생성자의 접근제한자와 상관없이
		// 모두 접근 가능하다.
	}

}

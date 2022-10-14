package Exam_19.packA;

public class A {
	public int field1;
	private int field2;
	int field3; // default 접근제한자.

	public void method1() {
		System.out.println("method1 실행");
	}

	private void method2() {
		System.out.println("method2 실행");
	}

	void method3() { // default 접근제한자.
		System.out.println("method3 실행");
	}

	public A() {
		// 다른 클래스에서 생성자는 생성할 수 있도록
		// public으로 정의
		this.field1 = 1;
		this.field2 = 2;
		this.field3 = 3;
		
		this.method1();
		this.method2();
		this.method3();

	}
}

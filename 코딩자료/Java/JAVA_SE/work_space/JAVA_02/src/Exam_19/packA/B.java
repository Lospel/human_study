package Exam_19.packA;

public class B {
	public static void main(String[] args) {
		A a = new A();
		a.field1 = 11;
		// public이므로 외부에서 접근하여 데이터 갱신 가능.
//		a.field2 = 12;
		// private이기 때문에 외부에서 접근 불가.
		a.field3 = 13;
		// default이기 때문에 같은 패키지의 외부에서
		// 데이터 갱신 가능.

		a.method1();
//		a.method2();
		// private이기 때문에 접근 불가.
		a.method3();
	}

}

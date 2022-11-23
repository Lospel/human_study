package Exam_19.packB;

import Exam_19.packA.A;

public class C {
	public static void main(String[] args) {
		A a = new A();
		a.field1 = 11;
		// public이므로 import를 통해서
		// 외부에서 접근하여 데이터 갱신 가능.
//		a.field2 = 12;
		// private이기 때문에 외부에서 접근 불가.
//		a.field3 = 13;
		// default이기 때문에 다른 패키지에서 접근 불가.

		a.method1();
//		a.method2();
		// private이기 때문에 접근 불가.
//		a.method3();
	}
}

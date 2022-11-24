package Exam_18.packB;

import Exam_18.packA.A;

public class C {
	public static void main(String[] args) {
		A a1 = new A(true);
		// public 생성자는 import를 통해서 접근 가능.
//		A a2 = new A(10);
		// private은 동일 클래스에서만 접근 가능.
		// 다른 pkg에서는 아예 접근 불가.
//		A a3 = new A(1.1, 5);
		// defalut는 동일 pkg 에서만 접근가능하므로
		// 다른 pkg 아예 접근 불가.
	}
}

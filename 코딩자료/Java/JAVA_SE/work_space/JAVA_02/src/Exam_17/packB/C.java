package Exam_17.packB;

import Exam_17.packA.B;

class C { // default
//	A a = new A();
	// A는 default이므로 다른 Package인 B에서 접근 불가.
	B b = new B();
	// B는 public이므로 import를 통해서 접근 가능.
	C c = new C();
	// 나 자신이므로 default라도 접근가능.
	D d = new D();
	// D는 public이므로 동일 Package인 B에서 접근 가능.
}

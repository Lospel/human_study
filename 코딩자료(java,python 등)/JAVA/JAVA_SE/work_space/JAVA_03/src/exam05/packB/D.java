package exam05.packB;

import exam05.packA.A;

public class D extends A {
	public static void main(String[] args) {
		D d = new D();
		d.field = 1;
		d.method();
		// A를 상속받은 D를 통해서.
		// A의 멤버변수와 메서드 접근 가능.
	}
}

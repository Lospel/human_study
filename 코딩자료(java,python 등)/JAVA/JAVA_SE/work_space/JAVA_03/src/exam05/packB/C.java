package exam05.packB;

import exam05.packA.A;

public class C {
	public static void main(String[] args) {
//		A a = new A();
		// 클래스는 public 이므로 접근가능.
		// 생성자는 protected이므로 접근불가.
		// 왜냐하면 protected는 동일 PKG에서만 접근가능함.
		// (단, 상속된 클래스는 예외)
//		a.field = 1;
//		a.method();
		// 필드와 메서드도 상속받지 않은 클래스이므로
		// protected이므로 동일 PKG가 아닌 C에서는 접근 불가.
	}

}

package exam05.packA;

public class B {
	public static void main(String[] args) {
		A a = new A();
		a.field = 1;
		a.method();
		// 동일 PKG 내에서는 protected가 접근 가능함.

	}

}

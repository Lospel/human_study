package exam08;

public interface MyInterface {
	public void method1();
	public default void method2() {
		System.out.println("MyInterface가 method2 호출");
	}
}

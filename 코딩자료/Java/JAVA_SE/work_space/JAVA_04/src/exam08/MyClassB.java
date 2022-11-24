package exam08;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB가 method1 호출");
	}
	
	@Override
	public void method2() {
		System.out.println("MyClassB가 method2 호출");
	}
}

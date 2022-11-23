package exam02;

public class Child extends Parent {
	public Child() {
		super();
		// 부모 생성자가 호출
		// 상속을 받은 자식 클래스의 생성자는 super 호출을 기본으로 한다.
		// super 호출은 한번만 꼭 해야한다.
		System.out.println("Child 생성자 호출");
	}
	public Child(int i) {
		super(i);
		System.out.println("인자가 있는 Child 생성자 호출");
	}
}

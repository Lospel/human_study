package Exercise06;

public class Child extends Parent {
	private String name;
	
	public Child() { //생성자
		this("홍길동");
		System.out.println("Child() call"); // 메서드
	}

	public Child(String name) {
		super();
		this.name=name;
		System.out.printf("Child(%s) call \n",this.name);

	}
}

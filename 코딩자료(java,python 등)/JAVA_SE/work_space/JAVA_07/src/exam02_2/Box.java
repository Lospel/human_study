package exam02_2;

public class Box<T> {
	private T t;

	public T getBox() {
		return t;
	}

	public void setBox(T t) {
		this.t = t;
	}
}
// <T>는 객체 생성시 정의한 타입으로 
// 클래스 전체에 동일하게 적용된다.
// 객체생성시 <String>이면, 위 클래스의 T는 모두 String.
// 객체생성시 <Integer>이면, 위 클래스의 T는 모두 int.
// 객체생성시 <Member>이면, 위 클래스의 T는 모두 Member.

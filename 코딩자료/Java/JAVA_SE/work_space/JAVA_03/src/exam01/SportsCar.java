package exam01;

//Car라는 부모 클래스를 상속받은 SportsCar 클래스(자식 클래스)
public class SportsCar extends Car {
	public SportsCar(int currentSpeed) {
		super(currentSpeed);
		// 부모 클래스의 생성자 호출
		this.currentSpeed = currentSpeed;
	}

	public void turboSpeedUp() {
		this.currentSpeed += 10;
	}
}

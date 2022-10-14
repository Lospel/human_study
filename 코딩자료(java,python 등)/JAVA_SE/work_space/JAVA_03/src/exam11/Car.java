package exam11;

public abstract class Car {
	// 차의 공통적인 특성을 설계단계에서 추상적으로 정의함.
	// 추상 클래스는 상속을 받아서 구체화하는 자식 클래스가 반드시 필요.
	int currentSpeed = 100;

	public Car() {
	}

	public void driving() {
		System.out.println("차가 달립니다.");
	}

	public void stop() {
		System.out.println("차가 멈춥니다.");
	}

	public abstract int speedUp(); // 추상 메서드

	public abstract int getCharge();
	// Car 클래스를 상속받아서 새로이 만드는 클래스가
	// 꼭 가져야 하는 메서드가 있어야 한다면,
	// 추상 메서드를 만들어 준다.
}

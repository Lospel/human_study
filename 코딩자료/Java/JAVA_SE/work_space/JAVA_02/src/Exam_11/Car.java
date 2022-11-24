package Exam_11;

public class Car {
	static int maxSpeed;
	int currentSpeed;

	public void speedUp() {
		this.currentSpeed = this.currentSpeed + 1;
		this.maxSpeed = this.maxSpeed + 1; // 정적 필드는 클래스명으로 접근하는 것을 권장하나 객체로도 접근가능하다.
		System.out.println(this.maxSpeed);
		System.out.println(Car.maxSpeed);

	}

	static { // 정적 변수를 초기화할 때 사용합니다.
		maxSpeed = 300;
//		currentSpeed = 100;	// 에러. 인스턴스 필드는 객체대상으로 초기화되어야 하기 때문.
//		speedUp();			// 에러. static 블럭 내에서는 인스턴스 메서드 호출 불가.
		// static 블럭내에서 인스턴스 플디 및 메서드가 에러인 이유는,
		// static이란 것을 클래스 로드시 우선 수행되는데, 이 시점에는 아직 객체가 생성되지 않았기 때문.
		// 객체 생성은 Car car = new Car(); 이 부분은 static 뒤에서 수행됨.
	}

	static void driving() {
//		this.speedUp();		// 에러. 정적메서드 내에서는 일반메서드 호출이 불가함. ==> new로 객체 생성후 접근 가능.
		Car car1 = new Car();
		car1.speedUp();
		maxSpeed = 250;
	}
}

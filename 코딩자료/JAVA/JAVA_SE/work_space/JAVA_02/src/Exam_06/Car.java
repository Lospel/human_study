package Exam_06;

public class Car {
	// 맴버변수
	public String company;
	public String model;
	public int maxSpeed;
	public int currentSpeed;

	// 생성자
	public Car() {
		this.company = "BMW";
		this.model = "BMW500";
		this.maxSpeed = 350;
		this.currentSpeed = 100;
	}

	public Car(String company, String model, int maxSpeed, int currentSpeed) {
		// 오버로딩된 생성자.
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}

	// 메서드
	public void speedUp() {
		this.currentSpeed = this.currentSpeed + 1;
	}

	public void speedUp(int speed) {
		// 오버로딩된 메서드
		this.currentSpeed = this.currentSpeed + speed;
	}

	public int speedDown() {
		this.currentSpeed = this.currentSpeed - 1;
		return this.currentSpeed;
	}

	public int speedDown(int speed) {
		// 오버로딩된 메서드
		this.currentSpeed = this.currentSpeed - speed;
		return this.currentSpeed;
	}
}

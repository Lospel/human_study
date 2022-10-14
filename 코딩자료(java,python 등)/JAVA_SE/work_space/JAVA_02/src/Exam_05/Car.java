package Exam_05;

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
		this.company = company;
		this.model = model;
		this.maxSpeed = maxSpeed;
		this.currentSpeed = currentSpeed;
	}
	// 메서드
}

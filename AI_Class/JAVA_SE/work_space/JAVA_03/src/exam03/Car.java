package exam03;

public class Car extends Vehicle {
	int oil;

	public Car() {
		super(); // 생략가능
		System.out.println("Car() 생성");
	}

	public Car(int oil) {
		super();
		// super는 인자가 없을 경우 생략 가능.
		// 부모 클래스의 인자가 없는 생성자가 있을 경우만 문제없음.
		// 단, 인자가 있을 때는 생략 불가.
		this.oil = oil;
		System.out.printf("Car(%d) 생성.\n", this.oil);
	}

	public Car(int oil, int speed) {
		super(speed);
		this.oil = oil;
		System.out.printf("Car(%d, %d) 생성.\n", this.oil, speed);
	}
}

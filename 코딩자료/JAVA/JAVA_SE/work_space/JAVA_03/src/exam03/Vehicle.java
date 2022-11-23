package exam03;

public class Vehicle {
	int speed;

	public Vehicle() {
		System.out.println("Vehicle() 생성");
	}

	public Vehicle(int speed) {
		this.speed = speed;
		System.out.printf("Vehicle(%d) 생성 \n", this.speed);
	}
}

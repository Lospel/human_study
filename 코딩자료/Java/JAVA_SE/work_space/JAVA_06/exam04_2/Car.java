package exam04_2;

public class Car {
	public String model;
	public int speed;
	
	public Car(String model) {
		this.model = model;
	}
	public Car(int speed) {
		this.speed = speed;
	}
	public Car(String model, int speed) {
		this.speed = speed;
		this.model = model;
	}
	public void speedUp() {
		this.speed++;
	}
	public int speedUp(int speed) {
		return this.speed++;
	}
	

}

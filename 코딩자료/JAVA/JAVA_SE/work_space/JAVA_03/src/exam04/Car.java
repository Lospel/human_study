package exam04;

//부모 객체
public class Car {
	public int currentSpeed;

	public Car(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public void speedUp() {
		this.currentSpeed++;
	}

}

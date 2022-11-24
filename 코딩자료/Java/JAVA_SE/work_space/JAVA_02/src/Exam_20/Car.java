package Exam_20;

public class Car {
	private int currentSpeed;
	private int maxSpeed;	// 차량별 최고속도.

	public Car(int currentSpeed, int maxSpeed) {
		this.currentSpeed = currentSpeed;
		this.maxSpeed = maxSpeed;
	}

	public void speedUp() {
		this.currentSpeed++;
	}
/*
	public void setCurrentSpeed(int currentSpeed) {
		if (currentSpeed > this.maxSpeed) {
			this.currentSpeed = this.maxSpeed;
		} 
		else {
			this.currentSpeed = currentSpeed;
		}
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}
*/

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		if (currentSpeed > this.maxSpeed) {
			this.currentSpeed = this.maxSpeed;
		} 
		else {
			this.currentSpeed = currentSpeed;
		}
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}

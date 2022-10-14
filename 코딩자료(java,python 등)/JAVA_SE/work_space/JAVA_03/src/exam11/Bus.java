package exam11;

public class Bus extends Car {

	@Override
	public int speedUp() {
		this.currentSpeed += 1;
		return this.currentSpeed;
	}

	@Override
	public int getCharge() {
		return 1200;
	}

}

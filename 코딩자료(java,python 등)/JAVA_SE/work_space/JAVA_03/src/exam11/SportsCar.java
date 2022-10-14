package exam11;

public class SportsCar extends Car {
	// 부모인 Car에서 추상 메서드가 있으니 꼭 구현 바람.

	@Override // annotation
	public int speedUp() {
		this.currentSpeed += 10;
		return this.currentSpeed;
	}

	@Override
	public int getCharge() {
		return 1450;
	}
}

package exam07;

public class Bus extends Car {
	public Bus() {
		super();
		System.out.println("Bus객체 생성");
	}
	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
	}
}

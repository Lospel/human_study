package exam09;

public class Taxi extends Car {
	public Taxi() {
		System.out.println("Taxi 객체 생성");
	}

	public int getCharge() {
		int money = 8000;
		System.out.printf("택시의 교통요금 : %d \n", money);
		return money;
	}
}

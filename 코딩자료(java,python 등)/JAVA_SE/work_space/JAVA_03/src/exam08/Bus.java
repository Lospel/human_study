package exam08;

public class Bus extends Car {
	public Bus() {
		System.out.println("Bus객체가 생성");
	}

	public int getCharge() { // 버스요금에 대해서 override함.
		int money = 1450;
		System.out.printf("버스의 교통요금 : %d \n", money);
		return money;
	}
}

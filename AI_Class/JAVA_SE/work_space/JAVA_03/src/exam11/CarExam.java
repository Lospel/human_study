package exam11;

public class CarExam {

	public static void main(String[] args) {
//		Car car1 = new Car(); 
		// 추상 클래스는 생성자를 못만든다.
		SportsCar sCar1 = new SportsCar();
		sCar1.driving();
		int speed = sCar1.speedUp();
		int charge = sCar1.getCharge();

		System.out.printf("속도: %d \t 요금: %d \n", speed, charge);

		sCar1.stop();
		System.out.println("------------------------");

		
		Bus bus1 = new Bus();
		bus1.driving();
		speed = bus1.speedUp();
		charge = bus1.getCharge();

		System.out.printf("속도: %d \t 요금: %d \n", speed, charge);

		bus1.stop();
	}

}

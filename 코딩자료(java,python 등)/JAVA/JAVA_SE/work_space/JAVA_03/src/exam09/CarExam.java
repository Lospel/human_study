package exam09;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Bus();
		int money = car1.getCharge();
		System.out.printf("요금 : %d \n", money);
		System.out.println("------------------------");

		Car car2 = new Taxi();
		money = car2.getCharge();
		System.out.printf("요금 : %d \n", money);
		System.out.println("------------------------");

		Car car3 = new Car();	
		System.out.println("car3 instanceof Bus : " + (car3 instanceof Bus));
		System.out.println("car1 instanceof Bus : " + (car1 instanceof Bus));

		if (car1 instanceof Bus) {
			Bus bus1 = (Bus) car1;
			bus1.run();
		} else {
			System.out.println("car1은 버스로 강제변환 불가");
		}
//		Bus bus2 = (Bus) car2;
//		bus2.run();
	
		if (car3 instanceof Bus) {
			Bus bus3 = (Bus) car3;
			bus3.run();
		}
		else System.out.println("car3은 버스로 강제변환 불가");
	}

}

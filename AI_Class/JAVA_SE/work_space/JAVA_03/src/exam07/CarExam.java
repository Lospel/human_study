package exam07;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Bus();
		car1.run();
		System.out.println("------------------");
		// 경차를 한대 사서 그 차로 출근함.
		
		Car car2 = new MicroCar();
		car2.run();
		System.out.println("------------------");
		
		// 택시를 타고 출근함.
		Car car3 = new Taxi();
		car3.run();
		System.out.println("------------------");
	}

}

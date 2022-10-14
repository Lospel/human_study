package exam06;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("--------------------");
		Car bus1 = new Bus();
		bus1.run();
		System.out.println("--------------------");
		Car mcar1 = new MicroCar();
		mcar1.run();
		System.out.println("--------------------");
		Car taxi1 = new Taxi();
		taxi1.run();

	}

}

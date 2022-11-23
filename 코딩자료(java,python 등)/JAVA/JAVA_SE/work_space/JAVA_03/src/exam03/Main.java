package exam03;

public class Main {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle(100);
		System.out.println("---------------------------");

		Car car1 = new Car();
		System.out.println("---------------------------");
		Car car2 = new Car(50);
		System.out.println("---------------------------");
		Car car3 = new Car(10, 30);
		System.out.println("---------------------------");

		HybrideCar h1 = new HybrideCar();
		System.out.println("---------------------------");
		HybrideCar h2 = new HybrideCar(90, 30);
		System.out.println("---------------------------");

	}

}

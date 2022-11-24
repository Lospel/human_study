package exam05;

public class CarExam {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.run();
		System.out.println("------------------");
		
		myCar1.tires[0] = new HTire();
		myCar1.run();

	}

}

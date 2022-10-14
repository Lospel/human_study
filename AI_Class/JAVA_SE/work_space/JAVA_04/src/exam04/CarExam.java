package exam04;

public class CarExam {

	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.run();
		System.out.println("------------------");
		
		myCar1.rearLeftTire = new HTire();
		myCar1.run();

	}

}

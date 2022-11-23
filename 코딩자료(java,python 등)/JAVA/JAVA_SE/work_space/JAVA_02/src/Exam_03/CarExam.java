package Exam_03;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.company = "현대자동차";
		car1.model = "그랜저";
		car1.maxSpeed = 300;
		car1.currentSpeed = 80;

		System.out.println("car1 : " + car1);
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println("car1.currentSpeed : " + car1.currentSpeed);
		System.out.println("----------------------------------------------");
		
		car1.company = "기아";
		car1.model = "K7";
		car1.maxSpeed = 250;
		car1.currentSpeed = 100;
		
		System.out.println("car1 : " + car1);
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println("car1.currentSpeed : " + car1.currentSpeed);
		System.out.println("----------------------------------------------");

		Car car2 = new Car();
		car2.company = "벤츠";
		car2.model = "C200";
		car2.maxSpeed = 200;
		car2.currentSpeed = 50;
		
		System.out.println("car2 : " + car2);
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		System.out.println("car2.currentSpeed : " + car2.currentSpeed);
		System.out.println("----------------------------------------------");

	}

}

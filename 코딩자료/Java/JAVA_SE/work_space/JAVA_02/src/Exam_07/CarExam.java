package Exam_07;

import Exam_05.Car;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("기아", "K7", 350, 60);

		System.out.println("car1 : " + car1);
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.maxSpeed : " + car1.maxSpeed);
		System.out.println("car1.currentSpeed : " + car1.currentSpeed);
		System.out.println("----------------------------------------------");

		System.out.println("car2 : " + car2);
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed);
		System.out.println("car2.currentSpeed : " + car2.currentSpeed);
		System.out.println("----------------------------------------------");

		
	}

}

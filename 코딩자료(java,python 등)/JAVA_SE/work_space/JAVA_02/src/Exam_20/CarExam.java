package Exam_20;

public class CarExam {

	public static void main(String[] args) {
		Car car1 = new Car(100, 300);
		car1.setCurrentSpeed(500);
		int car1Speed = car1.getCurrentSpeed();
		System.out.println(car1Speed);
		
		Car car2 = new Car(100, 200);
		car2.setCurrentSpeed(500);
		int car2Speed = car2.getCurrentSpeed();
		System.out.println(car2Speed);
	}

}

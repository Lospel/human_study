package exam13;

import exam04_2.Car;

public class ClassExam {

	public static void main(String[] args) {
		Car car = new Car("소나타");
		Class clazz1 = car.getClass();
		System.out.println (clazz1.getName());
		System.out.println (clazz1.getSimpleName());
		System.out.println (clazz1.getPackageName());
		System.out.println ();
		
	}

}

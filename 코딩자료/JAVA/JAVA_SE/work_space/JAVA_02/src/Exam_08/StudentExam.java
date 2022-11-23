package Exam_08;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student(5000, "강현준");
		Student s2 = new Student(10000, "강우혁");
		Student s3 = new Student(20000,"강주혁");
		Bus bus1 = new Bus(1, 10, 10000);
		Bus bus2 = new Bus(2, 5, 5000);
		Subway sw1 = new Subway(1, 50, 20000);
		Taxi taxi1 = new Taxi(1,50000);
		
		s1.takeBus(bus1);
		s1.showInfo();
		bus1.showInfo();
		System.out.println("-------------------------------");

		s1.takeBus(bus2);
		s1.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		System.out.println("-------------------------------");

		s2.takeBus(bus2);
		s1.showInfo();
		s2.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		System.out.println("-------------------------------");

		s2.takeSubway(sw1);
		s1.showInfo();
		s2.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		sw1.showInfo();
		System.out.println("-------------------------------");

		s3.takeTaxi(taxi1);
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		bus1.showInfo();
		bus2.showInfo();
		sw1.showInfo();
		taxi1.showInfo();
		
	}

}

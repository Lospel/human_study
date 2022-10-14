package Exam_08;

public class Student {
	public int money; // 현재 가지고 있는 돈
	public String name;

	public Student(int money, String name) {
		this.money = money;
		this.name = name;
	}

	public void takeBus(Bus bus) { // bus1 객체
		bus.take(1200);		//버스의 수입을 증가, 승객수를 증가시킴.
		this.money -= 1200;
	}

	public void takeSubway(Subway sw) {
		sw.take(1450);
		this.money -= 1450;
	}

	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
	}

	public void showInfo() {
		System.out.printf("%s님의 현재 잔고는 %d입니다. \n", this.name, this.money);
	}

}

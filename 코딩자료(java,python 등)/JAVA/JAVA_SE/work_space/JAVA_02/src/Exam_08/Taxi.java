package Exam_08;

public class Taxi {
	int taxiNumber;
	int money;

	public Taxi(int taxiNumber, int money) {
		this.taxiNumber = taxiNumber;
		this.money = money;
	}
	public void take(int money) {
		this.money += money;
	}
	public void showInfo() {
		System.out.printf("%d넘버의 택시 수입은 %d입니다. \n",this.taxiNumber,this.money);
	}
}

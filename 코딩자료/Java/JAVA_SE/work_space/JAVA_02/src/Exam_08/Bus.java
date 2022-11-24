package Exam_08;

public class Bus {
	public int busNumber;
	public int passangerCnt;
	public int money;

	public Bus(int busNumber, int passangerCnt, int money) {
		this.busNumber = busNumber;
		this.passangerCnt = passangerCnt;
		this.money = money;
	}

	public void take(int money) {
		this.money += money;
		this.passangerCnt++;
	}

	public void showInfo() {
		System.out.printf("%d번 버스는 %d명의 승객이 있고, %d의 수입이 있습니다. \n", this.busNumber, this.passangerCnt, this.money);
	}

}

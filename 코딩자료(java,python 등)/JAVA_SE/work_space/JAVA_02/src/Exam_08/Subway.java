package Exam_08;

public class Subway {
	public int lineNumber;
	public int passangerCnt;
	public int money;

	public Subway(int lineNumber, int passangerCnt, int money) {
		this.lineNumber = lineNumber;
		this.passangerCnt = passangerCnt;
		this.money = money;
	}

	public void take(int money) {
		this.money += money;
		this.passangerCnt++;
	}

	public void showInfo() {
		System.out.printf("%d라인은 %d명의 승객이 있고, %d의 수입이 있습니다. \n", this.lineNumber, this.passangerCnt, this.money);
	}
}

package exam06_03;

public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("버스를 타고 출근 합니다.");
	}
	public void checkFare() {	// 버스만의 메서드.
		System.out.println("승차요금일 비교합니다.");
	}
}

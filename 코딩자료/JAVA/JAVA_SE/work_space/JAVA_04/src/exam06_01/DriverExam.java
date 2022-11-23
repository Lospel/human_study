package exam06_01;

public class DriverExam {

	public static void main(String[] args) {
		Bus b = new Bus();
		Driver driver = new Driver();
		driver.drive(b);
		// Vehicle v = b
		// 자동타입변환 : 실제 구현클래스의 내용을 인터페이스의 구현 객체로 타입변환 가능
		// Vehicle v = new Bus();
		Taxi t = new Taxi();
		driver.drive(t);
	}

}

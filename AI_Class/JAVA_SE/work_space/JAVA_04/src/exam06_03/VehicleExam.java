package exam06_03;

public class VehicleExam {

	public static void main(String[] args) {
		Vehicle v = new Bus();
		v.run();

//		Bus b = (Bus) v;
//		b.run();
//		b.checkFare();

		// 강제타입변환을 위해서는 자동타입변환이 되었던 객체만 대상이 됨.
		// instanceof 를 통해서 대상을 확인할 수 있음.

		boolean isBus = (v instanceof Bus);
		System.out.println(isBus);
		// true가 나온다면, 자동타입변환이 된 관계.
		// 위의 내용처럼 바로 하기보다는 확인 후 강제타입변환을 해야함.

		if (v instanceof Bus) {
			Bus b = (Bus) v;
			b.run();
			b.checkFare();
			// Bus 만의 메서드를 수행하기 위해서, 강제타입변환(Vehicle ==> Bus)을 하고,
			// checkFare메서드 수행 가능함.
		}
	}

}

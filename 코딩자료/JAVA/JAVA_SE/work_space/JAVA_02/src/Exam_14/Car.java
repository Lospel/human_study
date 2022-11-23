package Exam_14;

public class Car {
	final String company = "현대";
	final String carId; // 차대번호
	String model;

	public Car(String carId, String model) {
		this.carId = carId;
		//final 지정된 멤버변수는 한번은 초기화가 가능.
		this.model = model;
	}

//	public void setCompany(String company) {
//		this.company = company;
//		//final 지정된 멤버변수는 초기화된 데이터를 변경 불가.
//	}
//	public void setCarId(String carId) {
//		this.carId = carId;
//	}

}

package Exam_10;

public class Car {
	static String company = "현대자동차";
	static String model = "그랜져";
	static String info;
	static {
		info = company + "-" + model;
	}	// 정적멤버만 가능.
	
}

package Exam_15;

public class Calc {
	static final double PI = 3.141592;
	// static은 클래스가 로드되는 시점에 PI에 값을 대입.
	// PI라는 변수는 3.141592라는 상수처럼 사용가능.

	double circle(double r) {
//		PI = 4.3;
		return PI * r * r; // 원의 넓이
	}
}

package Exam_09;

public class Employee {

	public int employeeId;
	public static int serialNum = 1000;
	// Static은 클래스 차원의 변수.

	public Employee() {
		serialNum++;
		this.employeeId = serialNum;
	}
}

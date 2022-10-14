package Exam_13;

public class Student {
	private static Student s = new Student();
	private Student() {
		
	}
	public static Student getInstance() {
		System.out.println(s);
		return s;
	}
}

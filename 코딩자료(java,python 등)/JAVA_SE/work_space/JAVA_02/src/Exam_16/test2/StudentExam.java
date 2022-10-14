package Exam_16.test2;

//import Exam_16.test1.Student;

public class StudentExam {

	public static void main(String[] args) {
		Exam_16.test1.Student s1 = new Exam_16.test1.Student("강현준", 80);
		
		s1.studentPrint();
		
		// 다른 Package에 있는 클래스의 객체를 생성시.
		// 1. import 문을 사용하거나.
		// 2. 클래스명 앞에 패키지명을 다 붙여준다.
	}

}

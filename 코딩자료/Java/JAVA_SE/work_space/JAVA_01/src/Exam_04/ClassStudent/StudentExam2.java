package Exam_04.ClassStudent;

public class StudentExam2 {

	public static void main(String[] args) {
		Student s1 = new Student(); // 객체를 생성한다.
//		System.out.println("s1.name : " + s1.name);
//		System.out.println("s1.kor : " + s1.kor);
//		System.out.println("s1.math : " + s1.math);
//		System.out.println("s1.eng : " + s1.eng);
		
		System.out.println();
		
		Student s2 = new Student("강우혁", 100,100,100);
//		System.out.println("s2.name : " + s2.name);
//		System.out.println("s2.kor : " + s2.kor);
//		System.out.println("s2.math : " + s2.math);
//		System.out.println("s2.eng : " + s2.eng);
		
//		s2.eng = 0;
//		System.out.println("s2.eng : " + s2.eng);
	
		System.out.println();

		Student s3 = new Student("강주혁", 100,100,100);
		

	}
	
}

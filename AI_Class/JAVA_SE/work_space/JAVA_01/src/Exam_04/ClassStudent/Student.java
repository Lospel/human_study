package Exam_04.ClassStudent;

public class Student { // 클래스명
	// 맴버변수
	public String name; // 이름
	public int kor; // 국어점수
	public int math; // 수학점수
	public int eng; // 영어점수


	public Student() {
		// 생성자 (클래스명과 동일한 Student 앞에 int 등의 형태가 없는 것=생성자)
		name = "강현준";
		kor = 80;
		math = 80;
		eng = 90;
	}

	public Student(String name, int kor, int math, int eng) {
		this.name = name; // this는 나 자신을 의미함.
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}



//매서드...
}

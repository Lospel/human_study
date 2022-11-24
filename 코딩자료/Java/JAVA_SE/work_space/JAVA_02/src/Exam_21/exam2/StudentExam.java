package Exam_21.exam2;

public class StudentExam {

	public static void main(String[] args) {
		Student s1 = new Student("K01", "강현준");
		//생성자 실행.
		s1.setSubjectScore("경제학", 80);
		s1.setSubjectScore("물류학", 80);
		s1.setSubjectScore("수학", 80);
		s1.setSubjectScore("컴퓨터학", 80);
		s1.setSubjectScore("영어", 80);

		s1.showInfo();

	}

}

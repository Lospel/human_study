package Exam_21.exam2;

public class Student {
	String studentId;
	String studentName;

	Subject economySubject; // 경제학 수강과목 이름과 점수.
	Subject logisticSubject; // 물류학
	Subject mathmaticSubject; // 수학
	Subject computerSubject; // 컴퓨터학
	Subject englishSubject; // 영어

	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;

		// Student의 s1 생성시점에
		// Subject 과목에 대한 생성자도 생성.
		// 이로써 각 과목별 인스턴스도 생성함.
		economySubject = new Subject("경제학");
		// economySubject.studentName = "경제학"
		// economySubject.score = 0; 초기값 0
		logisticSubject = new Subject("물류학");
		mathmaticSubject = new Subject("수학");
		computerSubject = new Subject("컴퓨터학");
		englishSubject = new Subject("영어");
	}

	public void setSubjectScore(String subjectName, int score) {
		if (subjectName.equals("경제학")) {
			economySubject.score = score;
		} else if (subjectName.equals("물류학")) {
			logisticSubject.score = score;

		} else if (subjectName.equals("수학")) {
			mathmaticSubject.score = score;

		} else if (subjectName.equals("컴퓨터학")) {
			computerSubject.score = score;

		} else if (subjectName.equals("영어")) {
			englishSubject.score = score;

		}
	}

	public void showInfo() {
		System.out.printf("%s 과목 \t 점수: %d \n", economySubject.subjectName, economySubject.score);
		System.out.printf("%s 과목 \t 점수: %d \n", logisticSubject.subjectName, logisticSubject.score);
		System.out.printf("%s 과목 \t 점수: %d \n", mathmaticSubject.subjectName, mathmaticSubject.score);
		System.out.printf("%s 과목 \t 점수: %d \n", computerSubject.subjectName, computerSubject.score);
		System.out.printf("%s 과목 \t 점수: %d \n", englishSubject.subjectName, englishSubject.score);

	}
}

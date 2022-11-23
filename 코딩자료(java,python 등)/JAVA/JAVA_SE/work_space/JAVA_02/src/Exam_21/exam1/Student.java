package Exam_21.exam1;

public class Student {
	String StudentId; // 학번
	String StudentName;
	String major; // 전공
	String[] courseName; // 수강과목
	int[] courseScore; // 과목별 점수

	Student(String StudentId, String StudentName, String major, String[] courseName) {
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		this.major = major;
		this.courseName = courseName;
//		this.courseScore = courseScore;
	}

	void setScores(int[] courseScore) {
		this.courseScore = courseScore;
	}

	void getScores() {
		int total = 0;
		double avg = 0.0;
		for (int i = 0; i < courseName.length; i++) {
			System.out.printf("%s과목 : %d 점 \n", courseName[i], courseScore[i]);
			total += courseScore[i];
		}
		avg = (double) total / courseName.length;
		System.out.printf("%s님의 총점은 %d이고, 평균은 %3.2f입니다. \n", this.StudentName, total, avg);
	}
}

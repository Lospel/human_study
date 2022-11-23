package Exam_21.exam1;

public class StudentExam {
	public static void main(String[] args) {
		String[] course1 = { "경제", "물류", "수학", "컴퓨터", "영어" };
		String[] course2 = { "컴퓨터", "수학", "영어", "네트웍", "그래픽" };
		String[] course3 = { "방송", "신문", "영어", "컴퓨터", "심리" };
		String[] course4 = { "교육", "심리", "철학", "영어", "아동" };

		Student s1 = new Student("K01", "강현준", "산업공", course1);
		Student s2 = new Student("K02", "김석훈", "컴퓨터공", course2);
		Student s3 = new Student("K03", "박선희", "신문방송학", course3);
		Student s4 = new Student("K04", "김태희", "교육학", course4);

		int[] scores1 = { 80, 90, 100, 90, 80 };
		s1.setScores(scores1);
		s1.getScores();
		System.out.println("----------------------------------");

		int[] scores2 = { 80, 90, 100, 90, 80 };
		s2.setScores(scores2);
		s2.getScores();
		System.out.println("----------------------------------");

		int[] scores3 = { 80, 90, 100, 90, 80 };
		s3.setScores(scores3);
		s3.getScores();
		System.out.println("----------------------------------");

		int[] scores4 = { 80, 90, 100, 90, 80 };
		s4.setScores(scores4);
		s4.getScores();
		System.out.println("----------------------------------");

	}

}

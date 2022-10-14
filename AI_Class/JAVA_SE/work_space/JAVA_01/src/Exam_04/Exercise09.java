package Exam_04;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0; // 전역변수로 처리하고 있는 이유.
		int[] scores = null;
//		int[] scores = new int[5];
//		int[] scores = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택=> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수=> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum]; // 학생수만큼 배열의 크기가 지정된다.
			} else if (selectNo == 2) {
				for (int x = 0; x < studentNum; x++) {
					System.out.printf("scores[%d]=> ", x);
					scores[x] = sc.nextInt();
				}
			} else if (selectNo == 3) {
				for (int x = 0; x < studentNum; x++) {
					System.out.printf("scores[%d]=> %d \n", x, scores[x]);
				}
			} else if (selectNo == 4) {
				int Max = 0;
				int Sum = 0;
				for (int A = 0; A < scores.length; A++) {
					Sum += scores[A];
					if (Max < scores[A]) {
						Max = scores[A];
					}
				}
				System.out.println("최고 점수: " + Max);
				System.out.printf("평균 점수: %2.2f \n", (double) Sum / studentNum);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}

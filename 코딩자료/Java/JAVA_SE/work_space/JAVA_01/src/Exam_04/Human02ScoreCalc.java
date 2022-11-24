package Exam_04;

public class Human02ScoreCalc {

	public static void main(String[] args) {
		int[] score = { 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int total = 0;

		System.out.println("score : " + score);
		System.out.println("score[0] : " + score[0]); // 첫번째는 0에서부터 시작.
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);
		System.out.println("score[10] : " + score[10]);
		System.out.println("score[19] : " + score[19]);
//		System.out.println("score[20] : " + score[20]);		// 에러남.
		System.out.println("score.length : " + score.length); // 배열의 총길이. = 20

		for (int cnt = 0; cnt < score.length; cnt++) {
			// score.length 형태로 사용하는 것이 에러를 줄일 수 있음.
			total += score[cnt];
		}
		
		System.out.printf("total : %d \n", total);
		System.out.printf("AVG : %2.2f \n", (double) total / (double) score.length);

		score[0] = 20;
		System.out.printf("score[0] : %d \n", score[0]);

	}
}

package Exam_02;

public class Human08DoWhile {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;

		do {
			sum += cnt;
			cnt++; // cnt = cnt +1; or cnt += 1;

			System.out.printf("1~%d까지 누적 합 : %d \n", cnt - 1, sum);
			System.out.printf("count : %d \n", cnt);
		} while (cnt <= 10);

		System.out.println("-------------------------------------------");
		System.out.printf("1~10까지의 합 : %d \n", sum);
		System.out.printf("cnt : %d \n", cnt);
	}
}

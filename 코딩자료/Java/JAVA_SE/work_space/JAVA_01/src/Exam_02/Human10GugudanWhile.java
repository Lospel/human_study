package Exam_02;

import java.util.Scanner;

public class Human10GugudanWhile {

	public static void main(String[] args) {
		// 5 X 1 = 5 ....
			
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단을 입력해주세요 ==> ");
		int dan = sc.nextInt();
		
		System.out.printf("%d단을 출력합니다. \n", dan);
		
		int cnt = 1;
		while (cnt <= 9) {		
			System.out.printf ("%d X %d = %d \n", dan,cnt,dan*cnt);
			cnt++;		
		}
	}
}

package Exam_02;

import java.util.Scanner;

public class Human03If3 {

	public static void main(String[] args) {
		// 점수를 입력받고, 그 점수에 따른 학점을 출력하는 프로그램을 만들 예정입니다.
		
		int score;
		Scanner sc = new Scanner(System.in);	// 시스템. 키보드에서 입력을 받는다.
		System.out.print("점수를 입력해주세요. ==>");	
		score = sc.nextInt();		// 정수로 점수를 키보드로써 입력받음.
		
		if (score >= 90) {
			System.out.println("당신의 점수는 A학점입니다.");
		}
		else if (score >= 80) {
			System.out.println("당신의 점수는 B학점입니다.");
		}
		else if (score >= 70) {
			System.out.println("당신의 점수는 C학점입니다.");
		}
		else if (score >= 60) {
			System.out.println("당신의 점수는 D학점입니다.");
		}
		else{
			System.out.println("당신의 점수는 F학점입니다.");
		}
	}

}

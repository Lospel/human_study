package Exam_02;

import java.util.Scanner;

public class Human02If2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor;
//		kor = 60;
		
		System.out.printf("당신의 점수를 입력해주세요?");
		Scanner sc = new Scanner (System.in);
		kor = sc.nextInt();				// 정수로 입력받음
		
		System.out.printf("당신의 국어점수는 %d입니다. \n", kor);
		
		if (kor >= 60) {
			System.out.println ("합격입니다.");
			// 합격 이후의 절차들... 합격증 출력, 합격에 따른 추가적으로 해야할일들...
		}
		else {			// if문이 참이 아니라면 수행하는 불럭
			System.out.println ("불합격입니다.");
			// 불합격에 따른 절차들. 다음 시험에 대한 안내 등..
		}
		
//		if (kor < 60) {
//			System.out.println ("불합격입니다.");
//		}
		
			System.out.println ("프로그램을 종료합니다.");
		
	
	}

}

package Exam_02;

import java.util.Scanner;

public class Human05If4 {

	public static void main(String[] args) {
//		60점 이상이면, 합격. 
//		근데 그 중에서도 90점 이상이면, 장학생임.
//		60점 미만. 불합격 표시.
//		ctrl + shift + f는 코드 정렬을 해준다.

		int score;
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요 ==>");
		score = sc.nextInt();

		if (score >= 60) {
			System.out.println("당신은 합격입니다.");
			if (score >= 90) {
				System.out.println("당신은 장학생입니다.");
			}
		} else {
			System.out.println("당신은 불학격입니다.");
		}

	}

}

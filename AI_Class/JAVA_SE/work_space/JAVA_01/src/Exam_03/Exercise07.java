package Exam_03;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		boolean run = true;

		int balance = 0;	// 현재의 잔고

		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------------");
			System.out.println("1.예급 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택==> ");

//			switch (sc.next()) {
//			case "1" :
//				System.out.print("예금액==> ");
//				balance += sc.nextInt();
//				break;
//			case "2" :
//				System.out.print("출급액==> ");
//				balance -= sc.nextInt();
//				break;
//			case "3" :
//				System.out.printf("잔고 ==>%d\n",balance);
//				break;
//			case "4" :
//				run = false;
//				break;
//			}

			int a = sc.nextInt();
			if (a == 1) {
				System.out.print("예금액==> ");
				balance += sc.nextInt();
			} else if (a == 2) {
				System.out.print("출급액==> ");
				balance -= sc.nextInt();
			} else if (a == 3) {
				System.out.printf("잔고 ==>%d\n", balance);
			} else if (a == 4) {
				break;
			} else {
				System.out.println("알맞은 숫자를 입력해주세요");
				continue;
			}
		}

		System.out.println("프로그램 종료");

	}
}

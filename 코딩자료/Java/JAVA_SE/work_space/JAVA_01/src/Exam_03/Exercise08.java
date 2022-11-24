package Exam_03;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {

		boolean z = true;
		int cnt = 0;
		while (z) {
			if (cnt < 10) {
				System.out.printf("cnt : %d \n", cnt);
			}
			if (cnt > 10) {
				break;
			}
			cnt++;
			if (cnt > 5) {
				continue;
			}
			System.out.println("cnt가 5이하입니다.");
		}
	}
}

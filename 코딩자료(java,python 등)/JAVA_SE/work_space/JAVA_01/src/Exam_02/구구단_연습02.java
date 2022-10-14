package Exam_02;

import java.util.Scanner;

public class 구구단_연습02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 값을 입력하시오. ===> ");
		int dan = sc.nextInt();
		System.out.println("------------------------------------");
		for (dan=dan; dan<=9; dan++) {
		for (int cnt=1; cnt<=9; cnt++){
			System.out.printf ("%d X %d = %d \n", dan,cnt,dan*cnt);
		} 
		System.out.println("------------------------------------");
		}
	}

}

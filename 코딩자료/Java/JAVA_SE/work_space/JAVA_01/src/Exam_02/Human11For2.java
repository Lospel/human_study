package Exam_02;

public class Human11For2 {

	public static void main(String[] args) {
		// 1~10까지 누적합을 2번 하고 싶어요.
		// 초기값; 조건; 증감
		int sum = 0;
		for (int x=0; x<2; x++) {
			for (int cnt=0; cnt<=10; cnt++) {
			sum = sum + cnt;
			
			System.out.printf("x = %d \n", x);
			System.out.printf("cnt = %d \n", cnt);
		}
		System.out.println("--------------------------------");
	}		
	}
}

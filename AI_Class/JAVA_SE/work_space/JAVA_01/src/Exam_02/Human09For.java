package Exam_02;

public class Human09For {

	public static void main(String[] args) {
		// 1~10까지 누적합;
		// 초기값; 조건; 증감
		int sum = 0;
		
		for (int cnt=0; cnt<=10; cnt++) {
			sum = sum + cnt;
			
			System.out.printf("1~%d까지의 합 : %d \n", cnt-1, sum);
			System.out.printf("cnt : %d \n", cnt);
		}
		System.out.println("-------------------------------------------");
		System.out.printf("1~10까지 누적 합 : %d \n", sum);
//		System.out.printf("현재의 count : %d \n", cnt);
	}

}

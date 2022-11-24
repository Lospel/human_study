package Exam_02;

public class Human07While {

	public static void main(String[] args) {
		// 1~10까지 반복하면서 총합을 구하는 프로그램.
		
		int cnt = 1;		// 현재의 위치 표현
		int sum = 0; 		// 누적 합을 가지고 있는 변수
		
		while (cnt <= 10) {		
			sum = sum + cnt;		// sum += cnt; 같은 의미
			// sum = 0, cnt = 1; ==> sum = 1 로 갱신 ==> sum = 3(1+2)
			cnt = cnt + 1;			// cnt += 1; 또는 cnt++; 같은 의미
			// cnt = 2로 갱신. ==> cnt = 3 갱신 ==> 
			System.out.printf("1~%d까지 누적 합 : %d \n", cnt-1, sum);
			System.out.printf("현재의 count : %d \n", cnt);
		}
		System.out.println("-------------------------------------------");
		System.out.printf("1~10까지 누적 합 : %d \n", sum);
		System.out.printf("현재의 count : %d \n", cnt);
	}

}

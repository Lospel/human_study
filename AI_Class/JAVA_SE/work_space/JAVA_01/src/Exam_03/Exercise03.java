package Exam_03;

public class Exercise03 {

	public static void main(String[] args) {
//		int sum = 0;
//		for (int a=1; a<=100; a++) {
//			if (a%3==0) {
//				sum += a;
//			}
//		}	
		int a = 1;
		int sum = 0;
		while (a<100) {
			a++;		
			if (a%3==0) {
			sum += a;
		}				
	}		
		System.out.printf("3의 배수의 합: %d",sum);
	}	
}


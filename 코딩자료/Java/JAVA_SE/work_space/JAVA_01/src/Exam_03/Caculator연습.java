package Exam_03;

import java.util.Scanner;

public class Caculator연습 {

	public static void main(String[] args) {
		
		int x1, x2;
		int result1, result2, result3;
		double result4;
		Scanner sc = new Scanner(System.in);
		System.out.print("x1 입력 : ");
		x1=sc.nextInt();
		System.out.print("x2 입력 : ");
		x2=sc.nextInt();
		
		System.out.println("1.덧셈|2.뺄샘|3.곱셈|4.나눗셈");
		int a=sc.nextInt();
		if (a==1) {
			result1 = add(x1,x2);
			System.out.println("덧셈==>");
			System.out.printf("x1 + x2 = %d \n", result1);
		}
		else if (a==2) {
			result2 = minus(x1,x2);
			System.out.println("뺄셈==>");
			System.out.printf("x1 - x2 = %d \n", result2);
		}
		else if (a==3) {
			result3 = multiple(x1,x2);
			System.out.println("곱셈==>");
			System.out.printf("x1 * x2 = %d \n", result3);
		}
		else if (a==4) {
			result4 = division(x1,x2);
			System.out.println("나눗셈==>");
			System.out.printf("x1 / x2 = %2.2f \n", result4);
		}
		else {
			System.out.println("다시 실행해주세요"); 		
		}
		
//		result1 = add(x1,x2);
//		result2 = minus(x1,x2);
//		result3 = multiple(x1,x2);
//		result4 = division(x1,x2);
//		
//		System.out.println("덧셈==>");
//		System.out.printf("x1 + x2 = %d \n", result1);
//		System.out.println("뺄셈==>");
//		System.out.printf("x1 - x2 = %d \n", result2);
//		System.out.println("곱셈==>");
//		System.out.printf("x1 * x2 = %d \n", result3);
//		System.out.println("나눗셈==>");
//		System.out.printf("x1 / x2 = %2.2f \n", result4);

	}

	private static int add(int x1, int x2) {
		int z = x1+x2;
		return z;
	}
	private static int minus(int x1, int x2) {
		int z = x1-x2;
		return z;
	}
	private static int multiple(int x1, int x2) {
		int z = x1*x2;
		return z;
	}
	private static double division(int x1, int x2) {
		double z = (double) x1/(double) x2;
		return z;
	}

}

package Exam_03;

public class Exercise06 {

	public static void main(String[] args) {
//		1번 문제	
//		for (int y = 1; y<=5; y++) {
//			for (int x = 1; x<=y; x++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		2번 문제
//		for (int y = 5; y>=1; y--) {
//			for (int x = 1; x<=y; x++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
		
//		3번 문제
//		for (int y = 1; y<=5; y++) {
//			for (int z =1; z+y<=5; z++) {
//				System.out.print(" ");
//			}
//			for (int x = 1; x<=y; x++) {
//				System.out.print("*");
//		    }
//		System.out.println();
//	}		
		
//		4번 문제
		for (int y=5; y>=1; y--) {
			for (int z=1; z+y<=5; z++) {
				System.out.print(" ");
		}
			for (int x=1; x<=y; x++) {
				System.out.print("*");
		}
			System.out.println();
		}	
		
}
}	


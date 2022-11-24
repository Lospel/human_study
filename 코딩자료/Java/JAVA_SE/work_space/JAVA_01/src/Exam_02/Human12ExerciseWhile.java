package Exam_02;

public class Human12ExerciseWhile {
	
	public static void main(String[] args) {
//		for (int x=2; x<=9; x++) {
//			for (int y=1; y<=9; y++){
//			System.out.printf ("%d X %d = %d \n", x, y, x*y);
//		}
//	}
//		System.out.println("------------------------------");
		int x=2;
		while (x<=9) {
			int y=1;
			while(y<=9) {
				System.out.printf ("%d X %d = %d \n", x, y, x*y);
				y++;
				}	
		System.out.println("------------------------------");
		x++;
		}
}
}

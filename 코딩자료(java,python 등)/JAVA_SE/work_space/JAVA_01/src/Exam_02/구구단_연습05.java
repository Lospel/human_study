package Exam_02;

public class 구구단_연습05 {

	public static void main(String[] args) {
		System.out.println("------------------------------------");
		for (int dan=1; dan<=9; dan++) {		
		  for (int cnt=1; cnt<=9; cnt++){
			if (cnt%2==1)
			System.out.printf ("%d X %d = %d \n", dan,cnt,dan*cnt);
		} 
		System.out.println("------------------------------------");
		}
	}
}

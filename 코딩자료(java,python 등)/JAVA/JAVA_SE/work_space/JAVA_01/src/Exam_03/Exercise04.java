package Exam_03;

public class Exercise04 {

	public static void main(String[] args) {
		boolean z = true;
		
		while (z) {
			double x1,x2;
			x1 = Math.random()*6 +1;	// 1~7을 포함하지 않는 난수
			x2 = Math.random()*6 +1;
			
			int a1, a2;
			a1 = (int)x1;	// 첫번째 주사위 눈 (1,2,3,4,5,6)
			a2 = (int)x2;	// 두번째 주사위 눈 (1,2,3,4,5,6)	
			System.out.printf("%d, %d ==> %d \n",a1,a2, a1+a2);
			
			if (a1+a2 == 5 || a1+a2 ==10) {		// 5 or 10 이면
//				z = false;
				break;		// z = false 대신에 break를 사용할 수 있음.
			}
		}
		
		}
	}	


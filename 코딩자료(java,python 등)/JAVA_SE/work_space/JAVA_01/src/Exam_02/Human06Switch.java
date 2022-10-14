package Exam_02;

public class Human06Switch {

	public static void main(String[] args) {
		// 고객의 등급에 따라서 고객 등급을 표현함.
		
		char grade = 'A';
		
		switch (grade) {
		case 'A' :
			System.out.println("당신은 A등급 회원입니다.");
			// A등급에 해당하는 할인율...
			break;			// Switch ~ Case 문은 마지막에 Break를 두어야 한다.
		case 'B' :
			System.out.println("당신은 B등급 회원입니다.");
			break;
		case 'C' :
			System.out.println("당신은 C등급 회원입니다.");
			break;
		default : 
			System.out.println("당신은 회원이 아닙니다.");
			break;

		}
	}

}

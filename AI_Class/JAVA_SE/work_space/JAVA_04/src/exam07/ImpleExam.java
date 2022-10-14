package exam07;

public class ImpleExam {

	public static void main(String[] args) {
		ImplementC impleC = new ImplementC();

		ImplementC interC = impleC;
		// 자동타입변환 (앞: 인터페이스 = 뒤: 클래스)
		interC.methodA();
		interC.methodB();
		interC.methodC();
		
		InterfaceA interA = impleC;
		interA.methodA();
		// 상속의 자동타입변환도 적용됨.
		// 부모의 인터페이스에 자식의 인터페이스 구현체 클래스 대입.
//		interA.methodB();
		// 불가. methodB는 InterfaceB의 구현체이므로 불가함.

		
	}

}

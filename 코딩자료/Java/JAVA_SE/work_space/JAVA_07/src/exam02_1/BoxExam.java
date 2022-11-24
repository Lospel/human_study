package exam02_1;

public class BoxExam {
	public static void main(String[] args) {
		Box b1 = new Box();
		b1.setBox("Human");
		String str1 = (String) b1.getBox();
		System.out.println(str1);
		
		Box b2 = new Box();
		b2.setBox(10);
		int intStr = (int) b2.getBox();
		System.out.println(intStr);
		
		// Box를 Object 형태로 선언하면
		// Object 하위인 String이든, int형이든 모든 클래스를 사용 가능.
		// 단, get 시점에 Object를 강제타입변환(강제캐스팅) 필요.

	}
}

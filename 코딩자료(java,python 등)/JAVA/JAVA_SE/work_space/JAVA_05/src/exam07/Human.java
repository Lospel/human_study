package exam07;

public class Human {

	public static void main(String[] args) {

		try {
			Human human1 = new Human();
			human1.run();
			human1 = null;
			// case1 : NullPointerException 발생 사례
			human1.run();

			Human human2 = new Human();
			human2.run();
			// case2 : NumberFormatException
			// 발생한 예외에 대해서 처리를 하지 않는다면, (NumberFormat 예외에 대한 소스 주석처리함)
			// finally를 수행한 후 시스템은 강제종료된다.

			String str = "a100";
			int intStr = Integer.parseInt(str);
			System.out.println("intStr : " + intStr);
		} catch (NullPointerException | NumberFormatException e) { // |는 or의 개념.
			System.out.println("Null-Pointer 또는 Number-Format 예외가 발생했습니다.");
//			System.out.println(e);
//			ne.printStackTrace();
			System.out.println(e.getMessage());
		} 
	finally {
			System.out.println("Finally를 실행합니다.");

		}
		System.out.println("시스템을 종료합니다.");
	}

	private void run() {
		System.out.println("사람이 달리다.");
	}

}

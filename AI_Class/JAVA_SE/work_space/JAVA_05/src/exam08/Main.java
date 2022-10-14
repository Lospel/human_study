package exam08;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.test("100", "a100");
		} 
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
//			System.out.println("NumberFormatException 발생");
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("시스템을 종료합니다.");
	}

}

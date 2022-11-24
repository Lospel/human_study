package exam04;

public class Human {

	public static void main(String[] args) {
		// case1 : NullPointerException 발생 사례
		
		try {
		Human human1 = new Human();
		human1.run();
		human1 = null;
//		human1.run();
		
		Human human2 = new Human();
		human2.run();
		}
		catch (NullPointerException e) {
			System.out.println("예외가 발생했습니다.");
			System.out.println(e);
			e.printStackTrace();
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

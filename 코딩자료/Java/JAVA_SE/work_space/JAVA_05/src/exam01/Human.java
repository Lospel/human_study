package exam01;

public class Human {

	public static void main(String[] args) {
		// case1 : NullPointException 발생 사례
//		Human human1 = new Human();
//		human1.run();
//		human1 = null;
//		human1.run();
		
		// case2 : ArrayIndexOutOfBoundsException
//		int [] scores = {10,20,30};
//		System.out.println("scores[2] : "+scores[2]);
//		System.out.print("scores[3] : ");
//		System.out.println(scores[3]);
		
		// case3 : NumberFormatException
//		String str = "a100";
//		int intStr = Integer.parseInt(str); // str을 정수로 변환하는 메서드.
//		System.out.printf("intStr : %d \n",intStr);
		
	}

	private void run() {
		System.out.println("사람이 달리다.");
	}

}

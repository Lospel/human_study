package Exam_03;

public class Function {

	public static void main(String[] args) {
//		printTest(); // 함수(메서드) 호출
//		System.out.println("--------------------------");
//		printTest(); // 함수를 만들면 여러번 호출해서 사용할 수 있다.
//		System.out.println("--------------------------");
		// 인자 유무에 따라, 인자의 갯수에 따라, 인자의 타입에 따라 다른 함수를 정의해야 한다.
		// return값에 따라서 함수가 또 재정의되어야 한다.
//		printTest("강현준");
//		printTest("강우혁");
//		System.out.println("--------------------------");
//		printTest("강현준", 47);
//		System.out.println("--------------------------");
//		printTest(47, 20);
//		System.out.println("--------------------------");

		// 함수가 void가 아니라면 return 값이 필요하며
		// 이 return값은 함수앞에 정의된 값의 타입과 동일해야 한다.
		// return값이 int 형이면, void==>int로 바꾸어야 한다.

		int x1, x2;
		double z1;
		x1 = add(10, 20);
		System.out.printf("x1 : %d \n", x1);

		System.out.println("--------------------------");
		System.out.printf("x- : %d \n", add(100, 200));
		System.out.println("--------------------------");

		x2 = add(10, 20, 30);
		System.out.printf("x2 : %d \n", x2);
		
		z1 = add(10.2, 20.1, 30.3);
		System.out.printf("z1 : %2.1f \n", z1);
	}

	private static int add(int i, int j) {
		System.out.printf("i : %d \n", i);
		System.out.printf("i : %d \n", j);
		int z = i + j;
		return z;
	}

	private static int add(int i, int j, int k) {
		return i + j + k;
	}

	private static double add(double d, double e, double f) {
		return d + e + f;
	}

	private static void printTest() {
		System.out.println("print함수 TEST1");
		System.out.println("print함수 TEST2");
		System.out.println("print함수 TEST3");
		System.out.println("print함수 TEST4");

	}

	private static void printTest(String string) {
		System.out.printf("제 이름은 %s입니다. \n", string);

	}

	private static void printTest(String string, int i) {
		System.out.printf("제 이름은 %s입니다.그리고, 제 나이는 %d입니다. \n", string, i);

	}

	private static void printTest(int i, int i2) {
		System.out.printf("저는 %d세 이고, 제 아들은 %d세 입니다. \n", i, i2);

	}

}

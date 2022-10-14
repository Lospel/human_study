package varAndMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		printDan(3);
		int a = 6;
		
	}
	public static void printDan(int dan) {
		for (int i=1;i<10;i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
			System.out.printf("%d * %d = %d\r", dan, i, dan*i);			
		}
	}

}

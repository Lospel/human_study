package exam18;

public class MathExam {

	public static void main(String[] args) {
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1= " + v1); // 절대값
		System.out.println("v2= " + v2);

		double v3 = Math.ceil(5.3); // 올림
		double v4 = Math.ceil(-5.3);
		System.out.println("v3= " + v3);
		System.out.println("v4= " + v4);

		double v5 = Math.floor(5.3); // 내림
		double v6 = Math.floor(-5.3);
		System.out.println("v5= " + v5);
		System.out.println("v6= " + v6);

		int v7 = Math.max(5, 9); // 2개의 수에서 최대값
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7= " + v7);
		System.out.println("v8= " + v8);

		int v9 = Math.min(5, 9); // 2개의 수에서 최소값
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9= " + v9);
		System.out.println("v10= " + v10);

		double v11 = Math.random(); // 0~1 사이 난수. 1은 미포함.
		System.out.println("v11= " + v11);

		double v12 = Math.rint(5.3); // 반올림 실수형
		double v13 = Math.rint(5.7);
		System.out.println("v12= " + v12);
		System.out.println("v13= " + v13);

		long v14 = Math.round(5.3); // 반올림 정수형
		long v15 = Math.round(5.7);
		System.out.println("v14= " + v14);
		System.out.println("v15= " + v15);

		double value = 12.3456; // 둘째 자리에서 반올림.
		double temp1 = value * 100; // 1234.56
		long temp2 = Math.round(temp1); // 1235
		double v16 = temp2 / 100.0; // 12.35 실수로 나누어줘야 v16이 실수가 됨.
		System.out.println("v16= " + v16); // 12.35

	}

}

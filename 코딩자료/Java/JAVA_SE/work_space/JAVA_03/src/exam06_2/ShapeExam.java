package exam06_2;

public class ShapeExam {

	public static void main(String[] args) {
		Shape circle = new Circle(10.0);
		System.out.printf("원의 넒이는 %3.2f입니다. \n", circle.calcArea());

		Shape rect = new RectAngle(5, 5);
		System.out.printf("사각형의 넒이는 %3.2f입니다. \n", rect.calcArea());

	}

}

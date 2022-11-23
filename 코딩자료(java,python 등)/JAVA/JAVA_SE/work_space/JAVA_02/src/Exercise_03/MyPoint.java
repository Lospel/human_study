package Exercise_03;

public class MyPoint {
	public int x;
	public int y;
	String caption;

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int x, int y) {
		double distance;
		System.out.printf("this.x : %d \n", this.x);
		System.out.printf("this.y : %d \n", this.y);
		System.out.printf("x : %d \n", x);
		System.out.printf("y : %d \n", y);

		distance = Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
		// 대각선 길이 = sqrt{(5-1)*(5-1)+(4-1)*(4-1)}
		return distance;
	}

	public void drawLine(int x1, int y1) {
		// 화면에 선을 그리는 무언가를 코딩한다면...
	}

	public void drawRect(int x1, int y1) {
		// 화면에 사각형을 그리는 무언가를 코딩한다면...
	}

}

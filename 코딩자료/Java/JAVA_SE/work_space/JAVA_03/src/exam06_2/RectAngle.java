package exam06_2;

public class RectAngle extends Shape {
	private int width;
	private int height;

	public RectAngle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		double a = this.height * this.width;
		return a;
	}

}

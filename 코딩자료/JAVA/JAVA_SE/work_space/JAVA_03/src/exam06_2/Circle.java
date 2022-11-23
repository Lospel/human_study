package exam06_2;

public class Circle extends Shape {

	private double r;
	public static final double PI = Math.PI;
	// Math.PI == 3.141592;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double calcArea() {
		double a = this.r * this.r * PI;
		return a;

	}

}

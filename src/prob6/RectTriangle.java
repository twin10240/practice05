package prob6;

public class RectTriangle extends Shape {

	public RectTriangle() {}
	
	public RectTriangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public double getArea() {
		return getWidth() * getHeight() * 0.5;
	}

	@Override
	public double getPerimeter() {
		return getWidth() + getHeight() + Math.sqrt(Math.pow(getWidth(), 2) + Math.pow(getHeight(), 2));
	}

}

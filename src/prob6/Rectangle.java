package prob6;

public class Rectangle extends Shape implements Resizable {
	
	public Rectangle() {}
	
	public Rectangle(double width, double height) {
		super(width, height);
	}

	@Override
	public void resize(double d) {
		setWidth(getWidth() * d);
		setHeight(getHeight() * d);
	}

	@Override
	public double getArea() {
		return getWidth() * getHeight();
	}

	@Override
	public double getPerimeter() {
		return (getWidth() + getHeight()) * 2;
	}

}

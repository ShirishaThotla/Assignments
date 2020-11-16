package Question1;

public class Circle extends Shape {

	private int radius;
	private static final float PI = 3.14f;

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	protected Float calculateArea() {

		return PI * radius * radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}

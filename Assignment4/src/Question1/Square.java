package Question1;

public class Square extends Shape {

	private int side;
	
	public Square(String name) {
		super(name);
		
	}
	
	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	protected Float calculateArea() {
		return (float) (side * side);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	
	
}

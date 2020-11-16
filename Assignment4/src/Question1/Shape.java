package Question1;

public abstract class Shape {

	protected String name;
	protected abstract Float calculateArea();
	
	public Shape(String name) {
		super();
		this.name = name;
	}
	

}

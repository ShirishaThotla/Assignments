package Question1;

import java.util.Scanner;

public class ShapeMainDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Circle\n 2.Square \n 3.Rectangle");

		Shape shape = null;
		System.out.println("Enter shape name: ");
		String name = scanner.nextLine();

		scanner.nextLine();
		if (name.equals("Circle")) {

			System.out.println("Enter the radius");
			int radius = scanner.nextInt();

			shape = new Circle(name, radius);
			Float area = shape.calculateArea();
			System.out.println("Circle Area: " + String.format("%.2f", area));
		} else if (name.equals("Square")) {

			System.out.println("Enter the side");
			int side = scanner.nextInt();

			shape = new Square(name, side);
			Float area = shape.calculateArea();
			System.out.println("Square Area:  %.2f" + String.format("%.2f", area));
		}
		else if (name.equals("Rectangle")) {

			System.out.println("Enter the length and breadth of rectangle");
			int length = scanner.nextInt();
			int breadth = scanner.nextInt();

			shape = new Rectangle(name, length, breadth);
			Float area = shape.calculateArea();
			System.out.println("Rectangle  Area:  %.2f" + String.format("%.2f", area));
		}

	}

}

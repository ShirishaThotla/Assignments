package Question5;

import java.util.Scanner;

import Question5.B;

public class ABdemoMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a value");
		int value=scanner.nextInt();
		
		B b1 = new B();
		B b2 = new B(value);
	}
}

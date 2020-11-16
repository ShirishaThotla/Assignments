package Question2;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a  value to calculate divisors sum");
		int number = scanner.nextInt();
		
		AdvancedArithematic advancedArithematic = new MyCalculator();
		int result = advancedArithematic.divisor_sum(number);
		
		System.out.println("I implemented: Advanced Arithematic");
		System.out.println(result);
	}

}

package Question3;

import java.util.Scanner;

public class Question3Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Question3 question3 = new Question3();

		long[] data = new long[5];
		System.out.println("Enter inputs");
		for (int i = 0; i < 5; i++) {

			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();

			long result = question3.power(num1, num2);
			if(result!=0) {
				System.out.println(result);
			}
		}

	}
}

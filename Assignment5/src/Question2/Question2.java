package Question2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int result = a/b;
			System.out.println(result);
		}
		catch(Exception e) {
			System.err.println(e);
		}
	}
}

package hcl_examplesMain;

import java.util.Scanner;

import hcl_examples.Question9;

public class Question9Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String string = scanner.nextLine();
		
		System.out.println("Enter a character: ");
		char ch = scanner.nextLine().charAt(0);
		
		Question9 question9 = new Question9();
		String result = question9.reshape(string, ch);
		
		System.out.println("Reverse String "+ result);
	}
}

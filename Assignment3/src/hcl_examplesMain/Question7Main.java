package hcl_examplesMain;

import java.util.Scanner;

import hcl_examples.Question7;

public class Question7Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = scanner.nextLine();

		Question7 question7 = new Question7();
		boolean result = question7.panagram(string);

		if (result == true) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not a Panagram");
		}
	}

}

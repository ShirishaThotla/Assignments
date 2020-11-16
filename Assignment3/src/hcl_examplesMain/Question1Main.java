package hcl_examplesMain;

import java.util.Scanner;

import hcl_examples.Question1;

public class Question1Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String string = scanner.nextLine();
		Question1 question1 = new Question1();

		String result = question1.toLowerCase(string);
		System.out.println("Resultant String: " + result);

		question1 = null;
		scanner = null;

	}

}

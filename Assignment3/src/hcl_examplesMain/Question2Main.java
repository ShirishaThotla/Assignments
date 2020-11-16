package hcl_examplesMain;

import java.util.Scanner;

import hcl_examples.Question2;

public class Question2Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String string = scanner.nextLine();

		Question2 question2 = new Question2();
		String result = question2.replaceOccurence(string);

		System.out.println("Resultant string:  " + result);

		question2 = null;
		scanner = null;
	}

}

package hcl_examplesMain;

import java.util.Scanner;

import hcl_examples.Question6;

public class Question6Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String value = scanner.nextLine();
		
		Question6 question6 = new Question6();
		boolean result  = question6.palindrome(value);
		
		if(result==true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

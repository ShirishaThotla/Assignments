package hcl_examplesMain;

import java.util.Scanner;

import hcl_examples.Question8;

public class Question8Main {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = scanner.nextLine();
		
		Question8 question8 = new Question8();
		String result = question8.getString(string);
		
		System.out.println("Resultant string  "+result);
	}

}

package hcl_examplesMain;

import java.util.Scanner;

import hcl_examples.Question5;

public class Question5Main {

	public static void main(String[] args) {
		

		Scanner scanner =new Scanner(System.in);
		String word = scanner.nextLine();
		
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		
		Question5 question5 = new Question5();
		String result = question5.subString(word, start, end);
		
		System.out.println("Substring between the indices is  "+ result);
	}

}

package Question1;

import java.util.Scanner;

public class Question1Main {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a file path");
		String string = scanner.nextLine();
		
		Question1 question1 = new Question1();
		question1.handleException(string);
		
	}
}

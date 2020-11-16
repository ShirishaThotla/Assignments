package Question2;

import java.util.Scanner;

public class MiddleCharacterMain {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a word : ");
		String word=scanner.nextLine();
		
		MiddleCharacter question2=new MiddleCharacter();
		String middleWord = question2.findMiddle(word);
		
		System.out.println("Middle Character: "+middleWord);
	}

}

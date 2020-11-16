package Question3;

import java.util.Scanner;

public class VowelCountMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter a string to know vowels: ");
		String word=scanner.nextLine();
		
		VowelCount question3= new VowelCount();
		int vowels_count = question3.VowelCount(word);
		
		System.out.println("No of Vowels in the string: "+vowels_count);
	}

}

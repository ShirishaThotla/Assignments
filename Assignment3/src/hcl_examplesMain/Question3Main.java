package hcl_examplesMain;

import java.util.Scanner;

import hcl_examples.Question3;

public class Question3Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a element " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

		Question3 question3 = new Question3();
		int[] result_array = question3.sortArray(array);

		System.out.println("Resultant elements are: ");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

	}
}

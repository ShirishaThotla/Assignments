package hcl_examplesMain;

import java.util.Scanner;

import hcl_examples.Question4;

public class Question4Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Enter a element " + (i + 1) + ": ");
			array[i] = scanner.nextInt();
		}

		System.out.print("Enter a key element: ");
		int key = scanner.nextInt();

		Question4 question4 = new Question4();
		int keyPosition = question4.searchElement(array, key);
		if (keyPosition != -1) {
			System.out.println("Element is found at position: " + keyPosition);
		} else {
			System.out.println("Element is not found in the array");
		}
	}
}

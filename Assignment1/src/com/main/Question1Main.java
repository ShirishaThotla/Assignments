package com.main;
/**
 * Write a Java program to print the result of the following operations.  

Test Data: 

a. -5 + 8 * 6 

b. (55+9) % 9  

c. 20 + -3*5 / 8  

d. 5 + 15 / 3 * 2 - 8 % 3  
 */

import java.util.Scanner;

import com.service.Question1;

public class Question1Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter values to test data: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		Question1 question1 = new Question1();
		System.out.println(question1.test(a, b, c));

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		System.out.println(question1.test1(a, b, c));

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		int d = scanner.nextInt();
		System.out.println(question1.test(a, b, c, d));

		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		int e = scanner.nextInt();
		int f = scanner.nextInt();
		System.out.println(question1.test(a, b, c, d, e, f));

		question1 = null;
		scanner.close();

	}

}

package com.main;

/**
 * 
 *  Write a Java program which iterates the integers from 1 to 100. For multiples of three print "Fizz" instead of the 
 *  number and print "Buzz" for the multiples of five. When number is divided by both three and five, print "fizz buzz". 

Ex :3 : fizz                                                                 

5 : buzz                                                                 

6 : fizz                                                                 

9 : fizz                                                                 

: buzz 
 * @author kiran
 */

import java.util.Scanner;

import com.service.Question7;

public class Question7Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a start range: ");
		int start = scanner.nextInt();

		System.out.println("Enter a end range: ");
		int end = scanner.nextInt();

		Question7 question7 = new Question7();
		question7.FizzBuzz(start, end);

		question7 = null;
	}

}

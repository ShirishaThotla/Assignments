package com.main;

/**
 * Write a java program, which will take a number variable and check whether the number is prime or not. 

Note:  Prime number is a number that is greater than 1 and divided by 1 or itself only. 
For example, 2, 3, 5, 7, 11, 13, 17.... are the prime numbers 
 * @author kiran
 */

import java.util.Scanner;

import com.service.Question5;

public class Question5Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number=scanner.nextInt();
		
		Question5 question5=new Question5();
		boolean flag=question5.primeCheck(number);
		
		if(flag) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}

		question5=null;
	}

}

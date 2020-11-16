package com.main;

/**
 * 
 * 	Write a program to read a number, calculate the sum of squares of even digits (values) present in the given number.  

Create a class UserMainCode with a static method sumOfSquaresOfEvenDigits which accepts a positive integer. The return type (integer) should be the sum of squares of the even digits. 

Create a class Main which would get the input as a positive integer and call the static method sumOfSquaresOfEvenDigits present in the UserMainCode. 

Sample Input 1: 

     56895 

Sample Output 1: 

      100 
 * 
 */

import java.util.Scanner;

import com.service.Question9;

public class Question9Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		Question9 question9=new Question9();
		int result= question9.sumOfSquaresOfEvenDigits(number);

		System.out.println("Squares of even digits is: "+result);
	}

}

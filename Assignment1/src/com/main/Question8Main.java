package com.main;

/**
 * 
 * Write a program to read a number and calculate the sum of odd digits (values) present in the given number. 

Create a class with a static method checkSum which accepts a positive integer.
 The return type should be 1 if the sum is odd. In case the sum is even return -1 as output. 

Create a class Main which would get the input as a positive integer and call the static method checkSum 
present in the UserMainCode. 

Sample Input 1: 

56895 

Sample Output 1: 

Sum of odd digits is odd. 

 Sample Input 2: 

84228 

Sample Output 2: 

Sum of odd digits is even. 
 */
import java.util.Scanner;

import com.service.Question8;

public class Question8Main {

	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number: ");
		long number=scanner.nextLong();
		
		int result=Question8.checkSum(number);
		if(result==1) {
			System.out.println("Sum of Odd digits is odd");
		}
		else {
			System.out.println("Sum of odd digits is even");
		}
	}

}

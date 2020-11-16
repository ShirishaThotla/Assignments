package com.main;

/**
 * 
 *  Write a Java program that takes three numbers as input to calculate and print the            
 *  average of the numbers. 
 * @author kiran
 */

import java.util.Scanner;

import com.service.Question3;

public class Question3Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number1: ");
		int num1=scanner.nextInt();
		
		System.out.println("Enter number2: ");
		int num2=scanner.nextInt();
		
		System.out.println("Enter number3: ");
		int num3=scanner.nextInt();
		
		Question3 question3=new Question3();
		float result=question3.average(num1, num2, num3);
		System.out.print(result);
		
		question3=null;
	}

}

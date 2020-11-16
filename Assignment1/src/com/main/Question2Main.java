package com.main;

/**
 * 
 * 
 * Write a Java program to print the sum 
 * (addition), multiply, subtract, divide and remainder of two numbers.  
 * 
 * 
 * @author kiran
 */

import java.util.Scanner;

import com.service.Question2;

public class Question2Main {

	public static void main(String[] args) {
		
		Scanner st=new Scanner(System.in);
		System.out.print("Enter first number: ");
		int number1=st.nextInt();
		System.out.print("Enter second number: ");
		int number2=st.nextInt();
		
		Question2 question2=new Question2();
		
		int result_add=question2.addition(number1, number2);
		System.out.println(result_add);
		
		int result_sub=question2.subtract(number1, number2);
		System.out.println(result_sub);
		
		int result_mul=question2.multiply(number1, number2);
		System.out.println(result_mul);
		
		int result_div=question2.divide(number1, number2);
		System.out.println(result_div);
		
		int result_rem=question2.remainder(number1, number2);
		System.out.println(result_rem);
		
		question2=null;
	}
}

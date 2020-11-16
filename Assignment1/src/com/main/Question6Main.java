package com.main;

/**
 * 
 * Write a Java program to print the ascii value of a given character.  
 *
 *	@author kiran
 */


import java.util.Scanner;

import com.service.Question6;

public class Question6Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char c=scanner.next().charAt(0);
		
		Question6 question6=new Question6();
		int result = question6.CharToAscii(c);
		
		System.out.println("Ascii value of "+ c +" character is: "+ result);
		
		question6=null;
	}
}

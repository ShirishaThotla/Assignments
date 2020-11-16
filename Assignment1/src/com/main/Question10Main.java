package com.main;

/**
 * Write a Program which finds the longest word from a sentence. Your program should read a sentence as input from user and return the longest word. In case there are two words of maximum length return the word which comes first in the sentence. 

Include a class UserMainCode with a static method getLargestWord which accepts a string The return type is the longest word of type string. 

Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode. 

Sample Input 1: 

Welcome to the world of Programming 

Sample Output 1: 

Programming 

Sample Input 2: 

ABC DEF 

Sample Output 2: 

ABC 
 * 
 * 
 * 
 */


import java.util.Scanner;

import com.service.Question10;

public class Question10Main {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence=scanner.nextLine();

		Question10 question10=new Question10();
		String result= question10.getLargestWord(sentence);
		
		System.out.println("Largest Word: "+result);
		
		question10=null;
	}

}

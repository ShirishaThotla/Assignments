package com.service;

/**
 *  Write a Program which finds the longest word from a sentence. Your program should read a sentence as input from user and return the longest word. In case there are two words of maximum length return the word which comes first in the sentence. 

 

Include a class UserMainCode with a static method getLargestWord which accepts a string The return type is the longest word of type string. 

 

Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode. 

 

Sample Input 1: 

Welcome to the world of Programming 

Sample Output 1: 

Programming 
 * @author user
 *
 */
public class Question10 {

	
	public static String getLargestWord(String sentence) {
		
		int flag=0;
		String[] strings=sentence.split(" ");
		
		int max=strings[0].length();
		for (int i = 0; i < strings.length; i++) {
			if(max<strings[i].length()) {
				max=strings[i].length();
				flag=i;
			}
		}
		return strings[flag];
	}
}

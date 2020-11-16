package com.service;

/**
 * Write a program to read a number and calculate the sum of odd digits (values) present in the given number. 

Create a class with a static method checkSum which accepts a positive integer. The return type should be 1 if the sum is odd. In case the sum is even return -1 as output. 

Create a class Main which would get the input as a positive integer and call the static method checkSum present in the UserMainCode. 

Sample Input 1: 

56895 

Sample Output 1: 

Sum of odd digits is odd. 

 Sample Input 2: 

84228 

Sample Output 2: 

Sum of odd digits is even. 


 * @author kiran
 *
 */


public class Question8 {

	public static int checkSum(long number) {
		
		long remainder;
		int sum=0;
		
		while(number!=0) {
			remainder=number%10;
			if(remainder%2!=0) {
				sum+=remainder;
			}
			number/=10;
		}
		if(sum%2!=0)
			return 1;
		return -1;
	}
}

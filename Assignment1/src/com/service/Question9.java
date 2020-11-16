package com.service;

/**
 * Write a program to read a number, calculate the sum of squares of even digits (values) present in the given number.  

Create a class UserMainCode with a static method sumOfSquaresOfEvenDigits which accepts a positive integer. The return type (integer) should be the sum of squares of the even digits. 

Create a class Main which would get the input as a positive integer and call the static method sumOfSquaresOfEvenDigits present in the UserMainCode. 

Sample Input 1: 

     56895 

Sample Output 1: 

      100 
 * 
 * 
 * 
 * 
 * @author kiran
 *
 */


public class Question9 {

	public int sumOfSquaresOfEvenDigits(int num) {
		
		int remainder;
		int sum=0;
		while(num!=0) {
			remainder=num%10;
			if(remainder%2==0) {
				sum+=(remainder*remainder);
			}
			num/=10;
		}
		
		return sum;
	}
}

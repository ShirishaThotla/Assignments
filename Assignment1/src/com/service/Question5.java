package com.service;

/**
 * Write a java program, which will take a number variable and check whether 
 * the number is prime or not. 

Note:  Prime number is a number that is greater than 1 and divided by 1 or itself only.
 For example, 2, 3, 5, 7, 11, 13, 17.... are the prime numbers 
 * @author user
 *
 */

public class Question5 {

	public boolean primeCheck(int value) {
		
		int count=0;
		for (int i = 1; i <= value; i++) {
			if(value%i==0)
				count++;
		}
		if(count==2)
			return true;
		return false;
	}
}

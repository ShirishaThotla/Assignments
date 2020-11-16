package com.service;

/**
 * Write a Java program to print the result of the following operations.  

Test Data: 

a. -5 + 8 * 6 

b. (55+9) % 9  

c. 20 + -3*5 / 8  

d. 5 + 15 / 3 * 2 - 8 % 3  
 * 
 * @author kiran
 *
 */


public class Question1 {

	public int test(int num1,int num2,int num3) {
			
		return -num1+num2*num3;
	}
	public int test1(int num1,int num2,int num3) {
		
		return (num1+num2)%num3;
	}
	public float test(int num1,int num2,int num3,int num4) {
		
		return (float)(num1-num2*num3/num4);
	}
	public float test(int num1,int num2,int num3,int num4,int num5,int num6) {
		
		return (float)(num1+num2/num3*num4-num5%num6);
	}
	
}

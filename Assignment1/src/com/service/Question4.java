package com.service;

/**
 * 	 Write a Java program to swap two variables.
 * @author user
 *
 */

public class Question4 {

	public int[] swap(int num1,int num2) {
		
		int[] swapped=new int[2];
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		swapped[0]=num1;
		swapped[1]=num2;
		
		return swapped;
		
	}
}

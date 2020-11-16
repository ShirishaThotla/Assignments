package com.main;


/**
 *  Write a Java program to swap two variables.
 * @author kiran
 */
import java.util.Scanner;

import com.service.Question4;

public class Question4Main {

	public static void main(String[] args) {
	
		Scanner st=new Scanner(System.in);
		
		System.out.print("Enter first variable: ");
		int num1=st.nextInt();
		
		System.out.print("Enter second variable: ");
		int num2=st.nextInt();
		
		Question4 question4=new Question4();
		int[] swappedValues=question4.swap(num1, num2);
		System.out.println("After swapping the values are: "+ swappedValues[0]+" "+ swappedValues[1]);
		
		question4=null;
	}

}

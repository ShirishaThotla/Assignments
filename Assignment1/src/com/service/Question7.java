package com.service;

public class Question7 {

	public void FizzBuzz(int start,int end) {
		
		for (int i = start; i < end; i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println("Fizz Buzz");
			}
			else if(i%3==0) {
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("Buzz");
			}
		}
	}
}

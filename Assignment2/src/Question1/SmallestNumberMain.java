package Question1;

import java.util.Scanner;

public class SmallestNumberMain {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter numbers to find smallest among them...");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();

		SmallestNumber question1=new SmallestNumber();
		int smallest= question1.SmallestNumber(num1, num2, num3);
		
		System.out.println("Smallest Number is: "+smallest);
	}

}

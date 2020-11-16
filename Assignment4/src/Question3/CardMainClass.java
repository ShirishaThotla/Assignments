package Question3;

import java.util.Scanner;

public class CardMainClass {

	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Select the Card");
			System.out.println("1.Payback Card\n2.Membership Card");
			int choice = sc.nextInt();
			
			sc.nextLine();
			PaybackCard card = null;
			if(choice == 1) {
				System.out.println("Enter the Card details:");
				String string = sc.nextLine();
				
				String[] list = string.split("|");
				for(String s:list) {
					System.out.println(s);
				}
				
				System.out.println("Enter points in card");
				int points = sc.nextInt();
				System.out.println("Enter Amount");
				double amount = sc.nextDouble();
				
				card = new PaybackCard(list[0], list[1], list[2], points, amount);
				
				System.out.println(card.holderName+"'s" + " Payback Card Details");
				System.out.println("Card Number "+ card.cardNumber );
				System.out.println("Points Earned "+ card.getPointsEarned());
				System.out.println("Total Amount "+ card.getTotalAmount());
			}
			
			

	}

}

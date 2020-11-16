package Question4;

import java.util.Scanner;

public class PlayerMainClass {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter player name");
		String playerName = scanner.nextLine();
		
		System.out.println("Enter the player age");
		int playerAge = scanner.nextInt();
		
		Player player = new Player(playerName,playerAge);
		player.getDetailsOfPlayer();
	}
	
}

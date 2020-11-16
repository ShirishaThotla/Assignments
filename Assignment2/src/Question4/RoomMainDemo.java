package Question4;

import java.util.Scanner;

public class RoomMainDemo {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter room details.. ");
		int roomNo = scanner.nextInt();
		scanner.nextLine();
		String roomType = scanner.nextLine();
		String roomArea = scanner.nextLine();
		String AcMachine = scanner.nextLine();
		
		Room room = new Room();
		room.setData(roomNo, roomType, roomArea, AcMachine);
		room.displayData();
		
		room = null;
		scanner = null;
	}

}

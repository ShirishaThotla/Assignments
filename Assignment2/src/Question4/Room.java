package Question4;

public class Room {

	private int roomNo;
	private String roomType;
	private String roomArea;
	private String ACmachine;
	
	public void setData(int roomNo,String roomType,String roomArea,String ACmachine) {
		
		this.roomNo   = roomNo;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.ACmachine= ACmachine; 
	}
	
	public void displayData() {
		
	    System.out.println(" Room Details..");
		System.out.println("Room No: "+roomNo);
		System.out.println("Room Type: "+roomType);
		System.out.println("Room Area: "+roomArea);
		System.out.println("AcMachine: "+ACmachine);
	}
	
}

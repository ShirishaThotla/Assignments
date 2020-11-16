package Question4;

public class Player {

	private String playerName;
	private int age ;
	
	public Player(String playerName, int age) {
		super();
		this.playerName = playerName;
		this.age = age;
	}
	
	public void getDetailsOfPlayer() {
		
		try {
			if(age<19) {
				
				throw new CustomException("Invalid Age Range Exception");
				
			}else {
				System.out.println("Player name: "+playerName);
				System.out.println("Player age: "+age);
			}
		}
		catch(CustomException e) {
			System.err.println("CustomException: "+e.getMessage());	
		}
	}
	
}

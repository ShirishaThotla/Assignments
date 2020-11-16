package Question5;

public class PlayerRunRate {

	private int totalRuns;
	private int totalOvers;
	public PlayerRunRate(int totalRuns, int totalOvers) {
		super();
		this.totalRuns = totalRuns;
		this.totalOvers = totalOvers;
	}
	
	public void getRunRate() {
		
		try {
			
			float runRate = totalRuns/totalOvers;
			System.out.println("Current Run Rate: "+runRate);
		}catch(Exception e) {
			System.err.println(e);
		}
	}
}

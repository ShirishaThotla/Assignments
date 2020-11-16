package Question5;

import java.util.Scanner;


public class PlayerRunRateMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int totalRuns = 0;
		int totalOvers= 0;
		
		PlayerRunRate playerRunRate = null;
		try {
			System.out.println("Enter the total runs scored ");
			totalRuns = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Enter the total overs faced ");
			totalOvers = Integer.parseInt(scanner.nextLine());
			
			playerRunRate = new PlayerRunRate(totalRuns,totalOvers);
			playerRunRate.getRunRate();
		}
		catch(Exception e) {
			System.err.println(e);
		}
		finally {
			playerRunRate = null;
			scanner.close();
		}
		
		
	}
}

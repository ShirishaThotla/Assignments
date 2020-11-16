package Question3;

public class VowelCount {

	public int VowelCount(String word) {		
		
		int count=0;
		for (int i = 0; i < word.length(); i++) {		
			if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u' ||
					word.charAt(i)=='A' || word.charAt(i)=='E' || word.charAt(i)=='I' || word.charAt(i)=='O' || word.charAt(i)=='U') {
				count++;
			}
		}
		
		return count;
	}
}

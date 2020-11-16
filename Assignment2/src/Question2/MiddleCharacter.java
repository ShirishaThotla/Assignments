package Question2;

public class MiddleCharacter {

	public String findMiddle(String word) {
		
		String middle="";
		if(word.length()%2==0) {
			
			middle+= word.charAt(word.length()/2-1);
			middle+= word.charAt(word.length()/2) ;
		}
		else {
			middle+=word.charAt(word.length()/2);
		}
		
		return middle;
	}
}

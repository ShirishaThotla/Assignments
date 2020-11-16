package hcl_examples;

public class Question2 {

	public String replaceOccurence(String string) {
		
		String str="";
		for (int i = 0; i < string.length(); i++) {
			
			char value = string.charAt(i);
			if(value == 'd' ) {
				str += 'h';
			}
			else {
				str += value;
			}
		}
		return str;
	}
}

package hcl_examples;

public class Question8 {

	public String getString(String string) {
		
		String result="";
		if(string.length()>=2) {
			if(string.charAt(0) == 'k' && string.charAt(1)=='b') {
				result = string;
			}
			else {
				if(string.charAt(0) == 'k') {
					if(string.charAt(1)!='b') {
						result += string.charAt(0);
					}
				}
				else {
					result = "";
				}
			}
		}
		for (int i = 2; i < string.length(); i++) {
			result += string.charAt(i);
		}
		
		return result;
	}
}

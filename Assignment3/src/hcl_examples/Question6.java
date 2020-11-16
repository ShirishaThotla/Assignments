package hcl_examples;

public class Question6 {

	public boolean palindrome(String string) {
		
		int len = string.length()-1;
		int flag = 0;
		for (int i = 0; i < string.length(); i++) {
			
			if(string.charAt(i) == string.charAt(len)) {
				len--;
			}
			else {
				flag=1;
				break;
			}
		}
		
		if(flag == 0) {
			return true;
		}
		return false;
	}
}

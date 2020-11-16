package hcl_examples;

public class Question5 {

	public String subString(String string, int start, int end) {

		String result = "";

		for (int i = start; i < end; i++) {
			result += string.charAt(i);
		}

		return result;
	}
}

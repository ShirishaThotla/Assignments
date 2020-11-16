package hcl_examples;

public class Question9 {

	public static String reshape(String string, char ch) {

		String finalString = "";
		for (int i = string.length() - 1; i >= 0; i--) {

			finalString += string.charAt(i);
			if (i != 0) {
				finalString += '-';
			}
		}

		return finalString;
	}
}

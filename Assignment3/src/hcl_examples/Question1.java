package hcl_examples;

public class Question1 {

	public String toLowerCase(String string) {

		char[] chars = string.toCharArray();
		String s = "";

		for (int i = 0; i < chars.length; i++) {

			int p = (int) chars[i];
			if (p < 97) {
				char r = (char) (p + 32);
				s += r;
			} else {
				s += chars[i];
			}
		}
		return s;
	}
}

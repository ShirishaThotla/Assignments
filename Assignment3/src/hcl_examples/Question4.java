package hcl_examples;

public class Question4 {

	public int searchElement(int[] array, int keyElement) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == keyElement) {
					return i+1;
			}
		}
		return -1;
	}
}

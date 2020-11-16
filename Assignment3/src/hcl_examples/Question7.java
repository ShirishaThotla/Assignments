package hcl_examples;

import java.util.HashMap;
import java.util.Map;

public class Question7 {

	public boolean panagram(String string) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < string.length(); i++) {

			char value = Character.toLowerCase(string.charAt(i));
			if (value >= 'a' && value <= 'z') {

				if (!map.containsKey(value)) {
					map.put(value, 1);
				} else {
					map.put(value, map.get(value));
				}
			}
		}
		int alphabetCount = 0;
		for (Map.Entry<Character, Integer> mp : map.entrySet()) {

			if (mp.getKey() >= 1) {
				alphabetCount++;

			}
		}
		if (alphabetCount == 26) {
			return true;
		}

		return false;

	}
}

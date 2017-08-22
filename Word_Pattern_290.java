import java.util.HashMap;
import java.util.HashSet;

public class Word_Pattern_290 {
	public static boolean wordPattern(String pattern, String str) {
		String[] words = str.split(" ");
		if (pattern.length() != words.length)
			return false;
		HashMap hm = new HashMap();
		for (int i = 0; i < words.length; i++) {
			if (hm.put(pattern.charAt(i), i) != hm.put(words[i], i))
	            return false;
		}
		return true;
	}

	public static void main(String[] args) {
		boolean out = wordPattern("abba", "dog cat cat dog");
		System.out.println(out);
	}
}

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given two strings s and t, write a function to determine if t is an anagram
 * of s.
 * 
 * For example, s = "anagram", t = "nagaram", return true. s = "rat", t = "car",
 * return false.
 * 
 * @author Liang-yu
 *
 */
public class Valid_Anagram_242 {
	public boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		HashSet<Character> hs = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (!hs.contains(s.charAt(i))) {
				hs.add(s.charAt(i));
				hm.put(s.charAt(i), 1);
			} else {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			}
		}

		for (int i = 0; i < t.length(); i++) {
			if (!hs.contains(t.charAt(i))) {
				return false;
			} else {
				hm.put(t.charAt(i), hm.get(t.charAt(i)) - 1);
			}
		}

		for (char e : hs) {
			if (hm.get(e) != 0)
				return false;
		}

		return true;

	}

	// online solution
	// public boolean isAnagram(String s, String t) {
	// int[] alphabet = new int[26];
	// for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
	// for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
	// for (int i : alphabet) if (i != 0) return false;
	// return true;
	// }

	
}

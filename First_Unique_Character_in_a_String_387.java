import java.util.HashMap;

/**
 * Given a string, find the first non-repeating character in it and return it's
 * index. If it doesn't exist, return -1.
 * 
 * Examples:
 * 
 * s = "leetcode" return 0.
 * 
 * s = "loveleetcode", return 2.
 * 
 * @author Liang-yu
 *
 */
public class First_Unique_Character_in_a_String_387 {
	public static int firstUniqChar(String s) {
		char[] sarray = s.toCharArray();
		boolean[] position = new boolean[sarray.length];
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < sarray.length; i++) {
			if (hm.get(sarray[i]) == null) {
				position[i] = true;
				hm.put(sarray[i], i);
			} else {
				position[i] = false;
				position[hm.get(sarray[i])] = false;
			}
		}
		for (int i = 0; i < position.length; i++) {
			if (position[i])
				return i;
		}
		return -1;
	}

	// online solution
	public int firstUniqChar2(String s) {
		int freq[] = new int[26];
		for (int i = 0; i < s.length(); i++)
			freq[s.charAt(i) - 'a']++;
		for (int i = 0; i < s.length(); i++)
			if (freq[s.charAt(i) - 'a'] == 1)
				return i;
		return -1;
	}

	public static void main(String[] args) {
		int out = firstUniqChar("loveleetcode");
		System.out.println(out);
	}
}

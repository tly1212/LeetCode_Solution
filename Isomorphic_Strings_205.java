import java.util.HashMap;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * For example, Given "egg", "add", return true.
 * 
 * Given "foo", "bar", return false.
 * 
 * Given "paper", "title", return true.
 * 
 * Note: You may assume both s and t have the same length.
 * 
 * @author Liang-yu
 *
 */
public class Isomorphic_Strings_205 {
	public static boolean isIsomorphic(String s, String t) {
		// this solution is O(N*N), because of the containsValue() method! Every
		// search of containsValue() is O(N).
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (!map1.containsKey(s.charAt(i)) && !map2.containsKey(t.charAt(i))) {
				map1.put(s.charAt(i), i);
				map2.put(t.charAt(i), i);
			} else if (map1.get(s.charAt(i)) != map2.get(t.charAt(i))) {
				return false;
			}
		}
		return true;

		// method 2 from online

		// int[] m = new int[512];
		// for (int i = 0; i < s1.length(); i++) {
		// if (m[s1.charAt(i)] != m[s2.charAt(i)+256]) return false;
		// m[s1.charAt(i)] = m[s2.charAt(i)+256] = i+1;
		// }
		// return true;
	}


	public static void main(String[] args) {
		boolean a = isIsomorphic("paper", "title");
		System.out.println(a);
	}
}

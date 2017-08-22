import java.util.HashMap;
import java.util.HashSet;

/**
 * Given a string which consists of lowercase or uppercase letters, find the
 * length of the longest palindromes that can be built with those letters.
 * 
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * 
 * @author Liang-yu
 *
 */
public class Longest_Palindrome_409 {
	public static int longestPalindrome(String s) {
		int len = 0;
		int odd = 0;
		char[] sa = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		HashSet<Character> hs = new HashSet<Character>();
		for (char e : sa) {
			if (hs.contains(e))
				hm.put(e, hm.get(e) + 1);
			else {
				hm.put(e, 1);
				hs.add(e);
			}
		}

		for (char e : hm.keySet()) {
			if (hm.get(e) % 2 == 0)
				len += hm.get(e);
			else if (hm.get(e) > odd)
				odd = hm.get(e);
		}
		return len + odd;
	}

	public static void main(String[] args) {
		int a = longestPalindrome("abccccDd");
		System.out.println(a);
	}
}

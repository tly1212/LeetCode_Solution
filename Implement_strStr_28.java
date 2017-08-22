/**
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 */
public class Implement_strStr_28 {
	public static int strStr(String haystack, String needle) {
		for (int i = 0; i < haystack.length(); i++) {
			for (int j = 0; j <= needle.length(); j++) {
				if (j == needle.length())
					return i;
				if (i + j == haystack.length())
					return -1;
				if (needle.charAt(j) != haystack.charAt(i + j))
					break;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(strStr("thanks", "s"));
	}
}

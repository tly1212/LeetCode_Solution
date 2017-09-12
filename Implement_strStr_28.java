/**
 * Implement strStr().
 * 
 * Returns the index of the first occurrence of needle in haystack, or -1 if
 * needle is not part of haystack.
 */
public class Implement_strStr_28 {
	public int strStr(String haystack, String needle) {
		if (haystack.equals(needle))
			return 0;
		else {
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
	}

	public int strStr2(String haystack, String needle) {
		if (haystack.equals(needle))
			return 0;
		else {
			for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
				if (haystack.substring(i, i + needle.length()).equals(needle))
					return i;
			}
			return -1;
		}
	}
}

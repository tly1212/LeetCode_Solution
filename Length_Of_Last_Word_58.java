/**
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space
 * characters only.
 * 
 * @author Liang-yu
 * 
 */
public class Length_Of_Last_Word_58 {
	public int lengthOfLastWord(String s) {
		int len = s.length() - 1, wlen = 0;
		while (len >= 0 && s.charAt(len) == ' ')
			len--;
		while (len >= 0 && s.charAt(len) != ' ') {
			wlen++;
			len--;
		}
		return wlen;
	}
	// online solution:
	// return s.trim().length()-s.trim().lastIndexOf(" ")-1;
}

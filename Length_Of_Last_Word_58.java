/**
 * 
 * @author Liang-yu Given a string s consists of upper/lower-case alphabets and
 *         empty space characters ' ', return the length of last word in the
 *         string.
 * 
 *         If the last word does not exist, return 0.
 * 
 *         Note: A word is defined as a character sequence consists of non-space
 *         characters only.
 * 
 *         For example, Given s = "Hello World", return 5.
 */
public class Length_Of_Last_Word_58 {
	public static int lengthOfLastWord(String s) {
		int len = s.length() - 1, wlen = 0;
		while (len >= 0 && s.charAt(len) != ' ') {
			wlen++;
			len--;
		}
		return wlen;
		// online solution:
		// return s.trim().length()-s.trim().lastIndexOf(" ")-1;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("thanks sss"));
	}
}

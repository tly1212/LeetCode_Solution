/**
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * For example, "A man, a plan, a canal: Panama" is a palindrome. "race a car"
 * is not a palindrome.
 * 
 * @author Liang-yu
 *
 */
public class Valid_Palindrome_125 {
	public static boolean isPalindrome(String s) {
		int len = s.length();
		if (len <= 1)
			return true;
		int i = 0, j = len - 1;
		while (i <= j) {
			while (!Character.isLetterOrDigit(s.charAt(i)))
				i++;
			while (!Character.isLetterOrDigit(s.charAt(j)))
				j--;
			if (Character.toUpperCase(s.charAt(i)) == Character.toUpperCase(s.charAt(j))) {
				i++;
				j--;
			} else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		boolean out = isPalindrome("ji;;;s,,si...j");
		System.out.println(out);
	}
}

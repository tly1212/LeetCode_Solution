/**
 * Given a string and an integer k, you need to reverse the first k characters
 * for every 2k characters counting from the start of the string. If there are
 * less than k characters left, reverse all of them. If there are less than 2k
 * but greater than or equal to k characters, then reverse the first k
 * characters and left the other as original.
 * 
 * @author Liang-yu
 *
 */
public class Reverse_String_II_541 {
	public String reverseStr(String s, int k) {
		char[] s1 = s.toCharArray();
		int i = 0, j = 2 * k - 1;
		for (; j < s1.length; i += 2 * k, j += 2 * k) {
			int m = i;
			int n = j - k;
			while (m < n) {
				char temp = s1[m];
				s1[m] = s1[n];
				s1[n] = temp;
				m++;
				n--;
			}
		}
		if ((s1.length - i < 2 * k) && (s1.length - 1 - i >= k)) {
			int m = i;
			int n = i + k - 1;
			while (m < n) {
				char temp = s1[m];
				s1[m] = s1[n];
				s1[n] = temp;
				m++;
				n--;
			}
		} else if (s1.length - 1 - i < k) {
			int m = i;
			int n = s1.length - 1;
			while (m < n) {
				char temp = s1[m];
				s1[m] = s1[n];
				s1[n] = temp;
				m++;
				n--;
			}
		}
		return new String(s1);
	}
}

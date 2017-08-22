/**
 * Given a positive integer, return its corresponding column title as appear in
 * an Excel sheet.
 * 
 * For example:
 * 
 * 1 -> A 2 -> B 3 -> C ... 26 -> Z 27 -> AA 28 -> AB
 * 
 * @author Liang-yu
 *
 */
public class Excel_Sheet_olumn_Title_168 {
	public static String convertToTitle(int n) {
		String out = "";// String builder could be more efficient
		int i;
		while (n > 0) {
			n--;
			i = n % 26;
			n = n / 26;

			char a = (char) ('A' + i);
			out = Character.toString(a) + out;
		}
		return out;
		// return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n %
		// 26));
	}

	public static void main(String[] args) {
		String a = convertToTitle(26 * 26 + 26);
		System.out.println(a);
	}
}

/**
 * 
 * @author Liang-yu Given two binary strings, return their sum (also a binary
 *         string).
 * 
 *         For example, a = "11" b = "1" Return "100".
 */
public class Add_Binary_67 {
	public static String addBinary(String a, String b) {
		int inda = a.length() - 1;
		int indb = b.length() - 1;
		int toNext = 0;
		String out = "";
		while (inda >= 0 && indb >= 0) {
			if (Integer.parseInt(a.charAt(inda) + "") + Integer.parseInt(a.charAt(inda) + "") + toNext == 3) {
				out = "1" + out;
				toNext = 1;
			} else if (Integer.parseInt(a.charAt(inda) + "") + Integer.parseInt(a.charAt(inda) + "") + toNext == 2) {
				out = "0" + out;
				toNext = 1;
			} else if (Integer.parseInt(a.charAt(inda) + "") + Integer.parseInt(a.charAt(inda) + "") + toNext == 1) {
				out = "1" + out;
				toNext = 0;
			} else if (Integer.parseInt(a.charAt(inda) + "") + Integer.parseInt(a.charAt(inda) + "") + toNext == 0) {
				out = "0" + out;
				toNext = 0;
			}
			inda--;
			indb--;
		}
		if (inda < 0) {
			while (indb >= 0) {
				if (Integer.parseInt(a.charAt(indb) + "") + toNext == 2) {
					out = "0" + out;
					toNext = 1;
				} else if (Integer.parseInt(a.charAt(indb) + "") + toNext == 1) {
					out = "1" + out;
					toNext = 0;
				} else if (Integer.parseInt(a.charAt(indb) + "") + toNext == 0) {
					out = "0" + out;
					toNext = 0;
				}
				indb--;
			}
		}
		if (indb < 0) {
			while (inda >= 0) {
				if (Integer.parseInt(a.charAt(inda) + "") + toNext == 2) {
					out = "0" + out;
					toNext = 1;
				} else if (Integer.parseInt(a.charAt(inda) + "") + toNext == 1) {
					out = "1" + out;
					toNext = 0;
				} else if (Integer.parseInt(a.charAt(inda) + "") + toNext == 0) {
					out = "0" + out;
					toNext = 0;
				}
				inda--;
			}
		}
		if (toNext == 0)
			return out;
		else
			return "1" + out;
	}

	// online solution
	// public String addBinary(String a, String b) {
	// StringBuilder sb = new StringBuilder();
	// int i = a.length() - 1, j = b.length() -1, carry = 0;
	// while (i >= 0 || j >= 0) {
	// int sum = carry;
	// if (j >= 0) sum += b.charAt(j--) - '0';
	// if (i >= 0) sum += a.charAt(i--) - '0';
	// sb.append(sum % 2);
	// carry = sum / 2;
	// }
	// if (carry != 0) sb.append(carry);
	// return sb.reverse().toString();
	// }

	public static void main(String[] args) {
		String out = addBinary("101", "1");
		System.out.println(out);
	}
}

/**
 * Given two non-negative integers num1 and num2 represented as string, return
 * the sum of num1 and num2.
 * 
 * Note:
 * 
 * The length of both num1 and num2 is < 5100. Both num1 and num2 contains only
 * digits 0-9. Both num1 and num2 does not contain any leading zero. You must
 * not use any built-in BigInteger library or convert the inputs to integer
 * directly.
 * 
 * @author Liang-yu
 *
 */
public class Add_Strings_415 {
	public static String addStrings(String num1, String num2) {
		char[] a1 = num1.toCharArray();
		char[] a2 = num2.toCharArray();
		int carry = 0;
		int out = 0;
		int i = a1.length - 1;
		int j = a2.length - 1;
		int p = 0;
		for (; i >= 0 && j >= 0; i--, j--) {
			out += (a1[i] + a2[j] - '0' * 2 + carry) % 10 * Math.pow(10, p);
			if (a1[i] + a2[j] + carry - '0' * 2 >= 10)
				carry = 1;
			else
				carry = 0;
			p++;
		}

		if (i < 0) {
			for (; j >= 0; j--) {
				out += (a2[j] - '0' + carry) % 10 * Math.pow(10, p);
				if (a2[j] + carry - '0' >= 10)
					carry = 1;
				else
					carry = 0;
				p++;
			}
		} else if (j < 0) {
			for (; i >= 0; i--) {
				out += (a1[i] - '0' + carry) % 10 * Math.pow(10, p);
				if (a1[i] + carry - '0' >= 10)
					carry = 1;
				else
					carry = 0;
				p++;
			}
		}
		out += Math.pow(10, p) * carry;
		return Integer.toString(out);
	}
	
	//online soltion
	public String addStrings2(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return sb.reverse().toString();
    }

	public static void main(String[] args) {
		String a = addStrings("901", "99");
		System.out.println(a);
	}
}

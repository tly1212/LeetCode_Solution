/**
 * Given a non-negative integer represented as a non-empty array of digits, plus
 * one to the integer.
 * 
 * You may assume the integer do not contain any leading zero, except the number
 * 0 itself.
 * 
 * The digits are stored such that the most significant digit is at the head of
 * the list.
 * 
 * @author Liang-yu
 *
 */
public class Plus_One_66 {
	public static int[] plusOne(int[] digits) {
		int idx = digits.length - 1;
		while (idx >= 0) {
			if (digits[idx] != 9) {
				digits[idx]++;
				return digits;
			}
			digits[idx] = 0;
			idx--;
		}
		int[] arr = new int[digits.length + 1];
		arr[0] = 1;
		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 9, 9, 8 };
		int[] b = plusOne(a);
		for (int e : b)
			System.out.print(e);
	}
}

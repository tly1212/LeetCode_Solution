/**
 * Power of Two
 * 
 * @author Liang-yu
 *
 */
public class Power_of_Two_231 {
	public static boolean isPowerOfTwo(int n) {
		while (n > 0 && n % 2 == 0) {
			n = n / 2;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		boolean a = isPowerOfTwo(3);
		System.out.println(a);
	}
}

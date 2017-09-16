/**
 * Power of Two
 * 
 * @author Liang-yu
 *
 */
public class Power_of_Two_231 {
	public boolean isPowerOfTwo(int n) {
		while (n > 0 && n % 2 == 0) {
			n = n / 2;
		}
		return n == 1;
	}
}

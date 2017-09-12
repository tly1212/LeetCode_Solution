/**
 * Implement int sqrt(int x).
 * 
 * Compute and return the square root of x.
 * 
 * @author Liang-yu
 *
 */
public class sqrt_x_69 {
	public static int mySqrt(int x) {
		if (x == 0)
			return 0;
		int high = x, low = 1;
		int n = low + (high - low) / 2;
		while (low <= high) {
			if (n == x / n) // cannot use n*n == x, may cause overflow
				return n;
			else if (n > x / n) { // same as above
				high = n - 1;
				n = low + (high - low) / 2;
			} else {
				low = n + 1;
				n = low + (high - low) / 2;
			}
		}
		return n - 1;
	}
}

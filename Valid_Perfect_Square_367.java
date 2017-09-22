/**
 * Given a positive integer num, write a function which returns True if num is a
 * perfect square else False.
 * 
 * Note: Do not use any built-in library function such as sqrt.
 * 
 * @author Liang-yu
 *
 */
public class Valid_Perfect_Square_367 {
	public boolean isPerfectSquare(int num) {
		int low = 1, high = num;
		while (low <= high) {
			// One thing to note is that we have to use long for mid to avoid
			// mid*mid from overflow. Also, you can use long type for low and
			// high to avoid type casting for mid from long to int.
			long mid = (low + high) / 2;
			if (mid * mid == num) {
				return true;
			} else if (mid * mid < num) {
				low = (int) mid + 1;
			} else {
				high = (int) mid - 1;
			}
		}
		return false;
	}
}

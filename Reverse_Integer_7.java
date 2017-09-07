/*
Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
*/
public class Reverse_Integer_7 {
	public int reverse(int x) {
		long rev = 0;
		while (x != 0) {
			rev = rev * 10 + x % 10;
			x = x / 10;
			if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
				return 0;
		}
		return (int) rev;
	}
}

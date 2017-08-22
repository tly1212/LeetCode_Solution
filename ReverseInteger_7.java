/*
Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
*/
public class ReverseInteger_7 {
	public static void main(String[] args) {
		int a = -123, retval = 0;
		boolean neg = false;
		while (a != 0) {
			int r = a % 10;
			retval = retval * 10 + r;
			a /= 10;
		}
		System.out.println(retval);
	}

}

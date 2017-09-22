/**
 * Given an integer, write a function to determine if it is a power of three.
 * 
 * @author Liang-yu
 *
 */
public class Power_of_Three_326 {
	public boolean isPowerOfThree(int n) {

		// n=3^i, i=log3(n), n is a power of three if and only if i is an
		// integer. In Java, we check if a number is an integer by taking the
		// decimal part (using % 1) and checking if it is 0.

		// Common pitfalls:

		// This solution is problematic because we start using doubles, which
		// means we are subject to precision errors. This means, we should never
		// use == when comparing doubles. That is because the result of
		// Math.log10(n) / Math.log10(3) could be 5.0000001 or 4.9999999. This
		// effect can be observed by using the function Math.log() instead of
		// Math.log10().
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}
}

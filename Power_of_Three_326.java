/**
 * Given an integer, write a function to determine if it is a power of three.
 * 
 * @author Liang-yu
 *
 */
public class Power_of_Three_326 {
	public boolean isPowerOfThree(int n) {
		return (Math.log10(n) / Math.log10(3)) % 1 == 0;
	}
}

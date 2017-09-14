/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * 
 * Note: Your solution should be in logarithmic time complexity.
 * 
 * @author Liang-yu
 *
 */
public class Factorial_Trailing_Zeroes_172 {
	public int trailingZeroes(int n) {
		 int ret = 0;
	        int num = 5;
	        while(n != 0){
	            ret += n/num;
	            n /= 5;
	        }
	        // why the following does not work?
		// while(num <= n){
		// ret += n/num;
		// num *= 5;
		// }
	        return ret;
	}
}

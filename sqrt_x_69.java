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
		int high = x, low = 1;
		int n = (high + low) / 2;
		while(n*n != x){
			if(n*n > x){
				high = n;
				n = (high + low) / 2;
			}
			else{
				low = n;
				n = (high + low) / 2;
			}
		}
		return n;
	}
	
	public static void main(String[] args) {
		System.out.println(mySqrt(16));
	}
}

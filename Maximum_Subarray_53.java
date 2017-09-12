/**
 * Kadane's algorithm
 * 
 * @author Liang-yu
 * 
 */
public class Maximum_Subarray_53 {
	public static int maxSubArray(int[] nums) {
		int sum = 0, maxv = Integer.MIN_VALUE;
		for (int e : nums) {
			sum += e;
			if (sum > maxv)
				maxv = sum;
			if (sum < 0)
				sum = 0;
		}
		return maxv;
	}

	public static void main(String[] args) {
		int[] a = { -1, 1, 2, -3 };
		System.out.println(maxSubArray(a));
	}
}

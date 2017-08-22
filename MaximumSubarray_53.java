/**
 * Kadane's algorithm
 * 
 * @author Liang-yu Find the contiguous subarray within an array (containing at
 *         least one number) which has the largest sum. For example, given the
 *         array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has
 *         the largest sum = 6.
 */
public class MaximumSubarray_53 {
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

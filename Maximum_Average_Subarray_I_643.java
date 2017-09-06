/**
 * Given an array consisting of n integers, find the contiguous subarray of
 * given length k that has the maximum average value. And you need to output the
 * maximum average value.
 * 
 * Note: 1 <= k <= n <= 30,000. Elements of the given array will be in the range
 * [-10,000, 10,000].
 * 
 * @author Liang-yu
 *
 */
public class Maximum_Average_Subarray_I_643 {
	public double findMaxAverage(int[] nums, int k) {
		int max = 0, sum = 0;
		for (int i = 0; i < k; i++) {
			max += nums[i];
		}
		sum = max;
		for (int i = 1; i < nums.length - k + 1; i++) {
			sum += nums[i + k - 1] - nums[i - 1];
			if (sum > max)
				max = sum;
		}
		return max * 1.0 / k;
	}
}

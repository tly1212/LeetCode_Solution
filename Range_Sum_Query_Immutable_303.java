/**
 * Given an integer array nums, find the sum of the elements between indices i
 * and j (i ≤ j), inclusive.
 * 
 * @author Liang-yu
 *
 */
public class Range_Sum_Query_Immutable_303 {
	int[] sum;
	public Range_Sum_Query_Immutable_303(int[] nums) {
		sum = new int[nums.length];
		sum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sum[i] = nums[i] + sum[i - 1];
		}
	}

	public int sumRange(int i, int j) {
		return sum[j] - sum[i - 1];
	}
}

/*
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); int param_1 = obj.sumRange(i,j);
 */

/**
 * Rotate an array of n elements to the right by k steps.
 * 
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to
 * [5,6,7,1,2,3,4].
 * 
 * solution from:https://leetcode.com/problems/rotate-array/#/solution
 * 
 * @author Liang-yu
 *
 */
public class Rotate_Array_189 {
	public void rotate(int[] nums, int k) {
		// O（n^2）
		for (int i = 0; i < k; i++) {
			int temp = nums[nums.length - 1];
			for (int j = nums.length - 1; j > 0; j--) {
				nums[j] = nums[j - 1];
			}
			nums[0] = temp;
		}
	}

	// Approach #2 Using Extra Array

	 // Approach #4 Using Reverse
//	 public void rotate(int[] nums, int k) {
//	 k %= nums.length;//This is because that sometimes, k is larger than the length of array. For example nums = [1, 2, 3, 4, 5], k = 12, this means we only need to rotate the last two numbers. k = k % nums.length = 2;
//	 reverse(nums, 0, nums.length - 1);
//	 reverse(nums, 0, k - 1);
//	 reverse(nums, k, nums.length - 1);
//	 }
//	 public void reverse(int[] nums, int start, int end) {
//	 while (start < end) {
//	 int temp = nums[start];
//	 nums[start] = nums[end];
//	 nums[end] = temp;
//	 start++;
//	 end--;
//	 }
//	 }
}

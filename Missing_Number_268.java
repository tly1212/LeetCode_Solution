/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array.
 * 
 * For example, Given nums = [0, 1, 3] return 2.
 * 
 * @author Liang-yu
 *
 */
public class Missing_Number_268 {
	public int missingNumber(int[] nums) {
		int sum = 0;
		for (int num : nums)
			sum += num;

		return (nums.length * (nums.length + 1)) / 2 - sum;
	}
}

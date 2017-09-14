import java.util.HashMap;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * solution 1 comes from:
 * https://discuss.leetcode.com/topic/8692/o-n-time-o-1-space-fastest-solution
 * 
 * @author Liang-yu
 *
 */

// HashMap takes O(n) time and o(n) space
public class Majority_Element_169 {
	// Boyer-Moore Majority Vote Algorithm
	// http://www.cs.utexas.edu/~moore/best-ideas/mjrty/
	public int majorityElement(int[] num) {
		int major = num[0], count = 1;
		for (int i = 1; i < num.length; i++) {
			if (count == 0) {
				count++;
				major = num[i];
			} else if (major == num[i]) {
				count++;
			} else
				count--;

		}
		return major;
	}

	public int majorityElement2(int[] nums) {
		int len = nums.length;
		Integer ret = null;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int e : nums) {
			hm.put(e, hm.getOrDefault(e, 0) + 1);
			if (hm.getOrDefault(e, 0) > len / 2) {
				ret = e;
				break;
			}
		}
		return ret;
	}
}

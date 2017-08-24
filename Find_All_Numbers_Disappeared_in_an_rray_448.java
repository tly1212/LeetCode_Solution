import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? You may assume the
 * returned list does not count as extra space.
 * 
 * @author Liang-yu
 *
 */
public class Find_All_Numbers_Disappeared_in_an_rray_448 {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> out = new ArrayList<Integer>();
		for (int i = 1; i <= nums.length; i++) {
			while (nums[i - 1] != i && nums[nums[i - 1] - 1] != nums[i - 1]) {
				int temp = nums[nums[i - 1] - 1];
				nums[nums[i - 1] - 1] = nums[i - 1];
				nums[i - 1] = temp;
			}
		}

		for (int i = 1; i <= nums.length; i++) {
			if (nums[i - 1] != i)
				out.add(i);
		}

		return out;
	}

	// online O(n) method
	public List<Integer> findDisappearedNumbers2(int[] nums) {
		List<Integer> ret = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			if (nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				ret.add(i + 1);
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		List<Integer> out = new ArrayList<Integer>();
		int[] in = { 3, 3, 2, 7, 8, 2, 3, 1 };
		out = findDisappearedNumbers(in);
		System.out.println(out.toString());
	}
}

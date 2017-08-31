import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an array of integers and an integer k, you need to find the number of
 * unique k-diff pairs in the array. Here a k-diff pair is defined as an integer
 * pair (i, j), where i and j are both numbers in the array and their absolute
 * difference is k.
 * 
 * @author Liang-yu
 *
 */
public class K_diff_Pairs_in_an_Array_532 {
	public static int findPairs(int[] nums, int k) {
		int ret = 0;
		if (k == 0) {
			HashSet<Integer> hs = new HashSet<Integer>();

			for (int e : nums)
				if (hs.contains(e))
					ret++;
				else
					hs.add(e);
		} else {
			HashSet<Integer> hs = new HashSet<Integer>();
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

			for (int i = 0; i < nums.length; i++) {
				if (!hs.contains(nums[i])) {
					hs.add(nums[i]);
					hm.put(nums[i], i);
				}
			}

			for (int e : hs) {
				if (hm.get(k + e) != null)
					ret++;
			}
		}
		return ret;
	}

	public static void main(String[] args) {
		int[] a = { 1, 3, 1, 5, 4 };
		int b = findPairs(a, 0);
		System.out.println(b);
	}
}

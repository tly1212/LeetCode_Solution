import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example: Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * 
 * Note: Each element in the result must be unique. The result can be in any
 * order.
 * 
 * @author Liang-yu
 *
 */
public class Intersection_of_Two_Arrays_349 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		if (nums1 == null || nums2 == null)
			return null;
		ArrayList<Integer> al = new ArrayList<Integer>();
		HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<Integer> ret = new HashSet<Integer>();
		for (int e : nums1) {
			if (!hs.contains(e)) {
				hs.add(e);
				hm.put(e, true);
			}
		}
		for (int e : nums2) {
			if (hm.get(e) != null) {
				ret.add(e);
				hm.put(e, false);
			}
		}

		int[] out = new int[ret.size()];
		int c = 0;
		for (int e : ret)
			out[c++] = e;
		return out;
	}
}

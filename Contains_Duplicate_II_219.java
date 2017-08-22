import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers and an integer k, find out whether there are two
 * distinct indices i and j in the array such that nums[i] = nums[j] and the
 * absolute difference between i and j is at most k.
 * 
 * @author Liang-yu
 *
 */
public class Contains_Duplicate_II_219 {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (i > k)
				set.remove(nums[i - k - 1]);
			if (!set.add(nums[i]))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		int[] b = {1,4,4};
		boolean a = containsNearbyDuplicate(b,1);
		System.out.println(a);
	}
}

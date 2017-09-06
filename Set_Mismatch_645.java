import java.util.ArrayList;
import java.util.HashSet;

/**
 * The set S originally contains numbers from 1 to n. But unfortunately, due to
 * the data error, one of the numbers in the set got duplicated to another
 * number in the set, which results in repetition of one number and loss of
 * another number.
 * 
 * Given an array nums representing the data status of this set after the error.
 * Your task is to firstly find the number occurs twice and then find the number
 * that is missing. Return them in the form of an array.
 * 
 * Note: The given array size will in the range [2, 10000]. The given array's
 * numbers won't have any order.
 * 
 * @author Liang-yu
 *
 */
public class Set_Mismatch_645 {
	public int[] findErrorNums(int[] nums) {
		ArrayList<Integer> ret = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<>();
		int sum = 0, size = nums.length;
		for (int e : nums) {
			if (hs.contains(e))
				ret.add(e);
			else
				hs.add(e);
			sum += e;
		}
		ret.add(size * (size + 1) / 2 - (sum - ret.get(0)));
		int[] res = { ret.get(0), ret.get(1) };
		return res;
	}
}

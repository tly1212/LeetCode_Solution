import java.util.Arrays;
import java.util.HashMap;

/**
 * Given scores of N athletes, find their relative ranks and the people with the
 * top three highest scores, who will be awarded medals: "Gold Medal",
 * "Silver Medal" and "Bronze Medal".
 * 
 * Example 1: Input: [5, 4, 3, 2, 1] Output: ["Gold Medal", "Silver Medal",
 * "Bronze Medal", "4", "5"]
 * 
 * @author Liang-yu
 *
 */
public class Relative_Ranks_506 {
	public String[] findRelativeRanks(int[] nums) {
		String[] ret = new String[nums.length];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++)
			hm.put(nums[i], i);

		Arrays.sort(nums);
		
		int i = 0;
		for (; i < nums.length - 3; i++)
			ret[hm.get(nums[i])] = nums.length - i + "";
		ret[hm.get(nums[i])] = "Bronze Medal";
		i++;
		ret[hm.get(nums[i])] = "Silver Medal";
		i++;
		ret[hm.get(nums[i])] = "Gold Medal";

		return ret;
	}
}

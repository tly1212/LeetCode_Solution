
/* 
 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/
import java.util.HashMap;

public class TwoSum_1 {
	public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            hm.put(nums[i], i);
        }
        
        for(int i = 0; i < nums.length; i ++){
            if( hm.get(target - nums[i]) != null && hm.get(target - nums[i]) != i){
                ret[0] = i;
                ret[1] = hm.get(target - nums[i]);
                return ret;
            }
        }
        return null;
    }
}

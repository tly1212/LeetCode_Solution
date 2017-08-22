
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
	public static void main(String[] args) {
		int first = -1, second = -1, sum = 17;

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		HashMap<Integer, Integer> hmap = foo(arr);
		for (int i = 0; i < arr.length; i++) {
			first = i;
			if (hmap.get(sum - arr[i]) != null) {
				second = hmap.get(sum - arr[i]);
				break;
			}
		}
		if (first >= 0 && second >= 0 && first != second)
			System.out.println(first + " : " + second);
		else
			System.out.println("no such two elements");
	}

	public static HashMap<Integer, Integer> foo(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], i);
		}
		return map;
	}
}

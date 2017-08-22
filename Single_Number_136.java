
/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Single_Number_136 {
	public static int singleNumber(int[] nums) {
		HashSet<Integer> map = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.contains(nums[i]))
				map.remove(nums[i]);
			else
				map.add(nums[i]);
		}
		List<Integer> list = new ArrayList<Integer>(map);
		return list.get(0);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 1 };
		int out = singleNumber(a);
		System.out.println(out);
	}

	// known that A XOR A = 0 and the XOR operator is commutative, the solution
	// will be very straightforward.
	/**
	 * For anyone who didn't understood why this works here is an explanation.
	 * This XOR operation works because it's like XORing all the numbers by
	 * itself. So if the array is {2,1,4,5,2,4,1} then it will be like we are
	 * performing this operation
	 * 
	 * ((2^2)^(1^1)^(4^4)^(5)) => (0^0^0^5) => 5. Hence picking the odd one out
	 * ( 5 in this case).
	 */
	// int singleNumber(int A[], int n) {
	// int result = 0;
	// for (int i = 0; i < n; i++) {
	// result ^= A[i];
	// }
	// return result;
	// }
}

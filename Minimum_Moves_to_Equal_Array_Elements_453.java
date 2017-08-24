/**
 * Given a non-empty integer array of size n, find the minimum number of moves
 * required to make all array elements equal, where a move is incrementing n - 1
 * elements by 1.
 * 
 * @author Liang-yu
 *
 */
public class Minimum_Moves_to_Equal_Array_Elements_453 {
	// Adding 1 to n - 1 elements is the same as subtracting 1 from one element
	public int minMoves(int[] nums) {
		int min = nums[0];
		int sum = 0;
		for (int e : nums) {
			if (e < min)
				min = e;
		}
		for (int e : nums) {
			sum += e - min;
		}
		return sum;
	}
}

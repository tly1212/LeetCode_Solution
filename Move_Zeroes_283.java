
public class Move_Zeroes_283 {
	public static void moveZeroes(int[] nums) {
		int end = nums.length - 1;
		int left = nums.length - 1;
		while (end >= 0 && nums[end] == 0) {
			end--;
			left--;
		}
		while (left >= 0) {
			if (nums[left] != 0) {
				left--;
			} else {
				for (int i = left; i < end; i++) {
					nums[i] = nums[i + 1];
				}
				nums[end] = 0;
				end--;
			}

		}
	}
	
	// online more efficient solution
	
	// void moveZeroes(vector<int>& nums)
	// {
	// int current = 0;
	//
	// for (int i = 0; i < nums.size(); ++i)
	// if (nums[i] != 0)
	// nums[current++] = nums[i];
	//
	// for (int i = current; i < nums.size(); ++i)
	// nums[i] = 0;
	// }
	

	public static void main(String[] args) {
		int[] a = { 0, 0, 1, 0, 0 };
		moveZeroes(a);
		for (int e : a)
			System.out.println(e);
	}
}

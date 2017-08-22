/**
 * 
 * @author Liang-yu You are climbing a stair case. It takes n steps to reach to
 *         the top.
 * 
 *         Each time you can either climb 1 or 2 steps. In how many distinct
 *         ways can you climb to the top?
 *         
 *         solution comes from: https://discuss.leetcode.com/topic/5371/basically-it-s-a-fibonacci/2
 */
public class Climbing_Stires_70 {
	public static int climbStairs(int n) {
		// base cases
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		int one_step_before = 2;
		int two_steps_before = 1;
		int all_ways = 0;

		for (int i = 2; i < n; i++) {
			all_ways = one_step_before + two_steps_before;
			two_steps_before = one_step_before;
			one_step_before = all_ways;
		}
		return all_ways;
	}
	
	public static void main(String[] args) {
		int out = climbStairs(3);
		System.out.println(out);
	}
}

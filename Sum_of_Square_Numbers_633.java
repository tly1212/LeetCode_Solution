/**
 * Given a non-negative integer c, your task is to decide whether there're two
 * integers a and b such that a2 + b2 = c.
 * 
 * @author Liang-yu
 *
 */
public class Sum_of_Square_Numbers_633 {
	public boolean judgeSquareSum(int c) {
		for (int i = 0; i * i <= c; i++) {
			if (Math.sqrt(c - i * i) == (int) Math.sqrt(c - i * i))
				return true;
		}
		return false;
	}
}

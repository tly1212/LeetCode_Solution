import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary search tree with non-negative values, find the minimum
 * absolute difference between values of any two nodes.
 * 
 * Note: There are at least two nodes in this BST.
 * 
 * @author Liang-yu
 *
 */
public class Minimum_Absolute_Difference_in_BST_530 {
	public int getMinimumDifference(TreeNode root) {
		int dif = Integer.MAX_VALUE;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode r = q.remove();
			if (r.left != null) {
				dif = Math.min(dif, Math.abs(r.val - r.left.val));
				q.add(r.left);
			}
			if (r.right != null) {
				dif = Math.min(dif, Math.abs(r.val - r.right.val));
				q.add(r.right);
			}
		}
		return dif;
	}
}

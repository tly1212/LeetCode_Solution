/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 * 
 * @author Liang-yu
 *
 */
public class Path_Sum_112 {

	public boolean hasPathSum(TreeNode root, int sum) {
		boolean v1, v2;
		if (root == null)
			return false;
		if (sum - root.val == 0 && root.left == null && root.right == null)
			return true;
		else {
			v1 = hasPathSum(root.left, sum - root.val);
			v2 = hasPathSum(root.right, sum - root.val);
		}
		return (v1 || v2);
	}
}

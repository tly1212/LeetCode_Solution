/**
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 * 
 * @author Liang-yu
 *
 */
public class Path_Sum_112 {

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null)
			return false;
		if (sum - root.val == 0 && root.left == null && root.right == null)
			return true;
		else 
			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);		
	}
}

/**
 * Given a binary tree, determine if it is height-balanced.
 * 
 * For this problem, a height-balanced binary tree is defined as a binary tree
 * in which the depth of the two subtrees of every node never differ by more
 * than 1.
 * 
 * @author Liang-yu
 *
 */
public class Balanced_Binary_Tree_110 {
	int max = 0;
	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		int diff = Math.abs(helper(root.right, 0) - helper(root.left, 0));
		if (diff > max)
			max = diff;
		if (max > 1)
			return false;
		return true;
	}

	public int helper(TreeNode node, int height) {
		if (node == null)
			return 0 + height;
		else {
			int a = helper(node.right, height + 1);
			int b = helper(node.left, height + 1);
			int diff = Math.abs(a - b);
			if (diff > max)
				max = diff;
			return Math.max(a, b);
		}
	}
	
	// not global field
	public boolean isBalanced2(TreeNode root) {
		if (root == null)
			return true;
		return Math.abs(helper2(root.right) - helper2(root.left)) < 2 && isBalanced2(root.right) && isBalanced2(root.left);
	}

	public int helper2(TreeNode node) {
		if (node == null)
			return 0;
		else {
			int a = helper2(node.right);
			int b = helper2(node.left);
			return Math.max(a , b ) + 1;
		}
	}
}

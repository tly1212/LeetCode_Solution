import java.util.Stack;

/**
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 * 
 * solution comes from:
 * https://discuss.leetcode.com/topic/5941/recursive-and-non-recursive-solutions
 * -in-java
 * 
 * @author Liang-yu
 *
 */
public class Symmetric_Tree_101 {

	// Recursive
	// public boolean isSymmetric(TreeNode root) {
	// return root == null || isSymmetricHelp(root.left, root.right);
	// }
	//
	// private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
	// if (left == null || right == null)
	// return left == right;
	// if (left.val != right.val)
	// return false;
	// return isSymmetricHelp(left.left, right.right) &&
	// isSymmetricHelp(left.right, right.left);
	// }

	// Non-recursive
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode left, right;
		if (root.left != null) {
			if (root.right == null)
				return false;
			stack.push(root.left);
			stack.push(root.right);
		} else if (root.right != null)
			return false;

		while (!stack.empty()) {
			if (stack.size() % 2 != 0)
				return false;
			right = stack.pop();
			left = stack.pop();
			if (right.val != left.val)
				return false;

			if (left.left != null) {
				if (right.right == null)
					return false;
				stack.push(left.left);
				stack.push(right.right);
			} else if (right.right != null) {
				return false;
			}

			if (left.right != null) {
				if (right.left == null)
					return false;
				stack.push(left.right);
				stack.push(right.left);
			} else if (right.left != null) {
				return false;
			}
		}

		return true;
	}
}

import java.util.LinkedList;
import java.util.Queue;
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
	public boolean isSymmetric(TreeNode root) {
		return root == null || isSymmetricHelp(root.left, root.right);
	}

	private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
		if (left == null || right == null)
			return left == right;
		if (left.val != right.val)
			return false;
		return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
	}

	// Non-recursive
	public boolean isSymmetric2(TreeNode root) {
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

	// online itarative solution
	public boolean isSymmetric3(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode t1 = q.poll();
			TreeNode t2 = q.poll();
			if (t1 == null && t2 == null)
				continue;
			if (t1 == null || t2 == null)
				return false;
			if (t1.val != t2.val)
				return false;
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);
		}
		return true;
	}
}

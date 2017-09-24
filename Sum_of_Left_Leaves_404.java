import java.util.Stack;

/**
 * Find the sum of all left leaves in a given binary tree.
 * 
 * @author Liang-yu
 *
 */
public class Sum_of_Left_Leaves_404 {
	public int sumOfLeftLeaves(TreeNode root) {
		int sum = 0;
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 0;
		if (root.left != null && root.left.right == null && root.left.left == null)
			sum += root.left.val;

		if (root.left == null && root.right != null)
			sum += sumOfLeftLeaves(root.right);
		else if (root.right == null && root.left != null)
			sum += sumOfLeftLeaves(root.left);
		else
			sum += sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);

		return sum;
	}

	// iterative
	public int sumOfLeftLeaves2(TreeNode root) {
		if (root == null)
			return 0;
		int ans = 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);

		while (!stack.empty()) {
			TreeNode node = stack.pop();
			if (node.left != null) {
				if (node.left.left == null && node.left.right == null)
					ans += node.left.val;
				else
					stack.push(node.left);
			}
			if (node.right != null) {
				if (node.right.left != null || node.right.right != null)
					stack.push(node.right);
			}
		}
		return ans;
	}
}

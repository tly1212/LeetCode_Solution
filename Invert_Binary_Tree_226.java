import java.util.LinkedList;
import java.util.Queue;

/**
 * Invert a binary tree.
 * 
 * @author Liang-yu
 *
 */
public class Invert_Binary_Tree_226 {
	// recursive

	public TreeNode invertTree(TreeNode root) {
		if (root == null)
			return root;
		TreeNode left = invertTree(root.left);
		TreeNode right = invertTree(root.right);
		root.right = left;
		root.left = right;
		return root;
	}

	// iterative
	public TreeNode invertTree2(TreeNode root) {
		if (root == null)
			return null;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode current = queue.poll();
			TreeNode temp = current.left;
			current.left = current.right;
			current.right = temp;
			if (current.left != null)
				queue.add(current.left);
			if (current.right != null)
				queue.add(current.right);
		}
		return root;
	}
}

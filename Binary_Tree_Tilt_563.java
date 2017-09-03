/**
 * Given a binary tree, return the tilt of the whole tree.
 * 
 * The tilt of a tree node is defined as the absolute difference between the sum
 * of all left subtree node values and the sum of all right subtree node values.
 * Null node has tilt 0.
 * 
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 * 
 * Note:The sum of node values in any subtree won't exceed the range of 32-bit
 * integer. All the tilt values won't exceed the range of 32-bit integer.
 * 
 * @author Liang-yu
 *
 */
public class Binary_Tree_Tilt_563 {
	static int tilt = 0;

	public static int findTilt(TreeNode root) {
		if (root == null)
			return 0;
		sum(root);
		return tilt;
	}

	public static int sum(TreeNode node) {
		if (node == null)
			return 0;
		int a = sum(node.right);
		int b = sum(node.left);
		tilt += Math.abs(a - b);
		return node.val + a + b;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(4);
		root.left.left.left.left = new TreeNode(5);
		int ret = findTilt(root);
		System.out.println(ret);
	}
}
